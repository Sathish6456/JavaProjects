package com.zensar.olx.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olx.bean.LoginResponse;
import com.zensar.olx.bean.LoginUser;
import com.zensar.olx.bean.OlxUser;
import com.zensar.olx.db.TokenStorage;
import com.zensar.olx.filter.jwt.util.JwtUtil;
import com.zensar.olx.service.OlxUserService;

@RestController
public class OlxUserController {

	@Autowired
	private AuthenticationManager manager;

	@Autowired
	private JwtUtil util;

	@Autowired
	OlxUserService service;

	/**
	 *
	 * @param user
	 * @return
	 */

	@PostMapping("/user/authenticate")
	public LoginResponse login(@RequestBody LoginUser loginUser) {
		UsernamePasswordAuthenticationToken authenticationToken;
		authenticationToken = new UsernamePasswordAuthenticationToken(loginUser.getUserName(), loginUser.getPassword());
		System.out.println(loginUser.getPassword());
		System.out.println(loginUser.getUserName());
		try {
			Authentication authentication=this.manager.authenticate(authenticationToken);

			String token = util.generateToken(loginUser.getUserName());

			TokenStorage.storeToken(token, token);
			LoginResponse userResponse =new LoginResponse();

			return userResponse;
		} catch (Exception e) {
			throw e;
		}

	}

	@PostMapping("/user")
	public OlxUser addOlxUser(@RequestBody OlxUser olxUser) {
		return this.service.addOlxUser(olxUser);

	}

	@GetMapping("/user/{uid}")
	public OlxUser findOlxUserById(@PathVariable(name = "uid") int id) {
		return this.service.findOlxUser(id);
	}

	@GetMapping("/user/find/{userName}")
	public OlxUser findOlxUserByName(@PathVariable(name = "userName") String name) {
		return this.service.findOlxUserByName(name);

	}

	@GetMapping("/validate/token")
	public ResponseEntity<Boolean> isValidateUser(@RequestHeader("Authorization") String authToken) {
		try {
			String validatedToken = util.validateToken(authToken.substring(7));
			
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();

			return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/user/logout")
	public ResponseEntity<Boolean> logout(@RequestHeader("Authorization") String authToken) {
		String validatedToken = authToken.substring(7);

		try {

			TokenStorage.removeToken(validatedToken);
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();

			return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
		}
	}

}