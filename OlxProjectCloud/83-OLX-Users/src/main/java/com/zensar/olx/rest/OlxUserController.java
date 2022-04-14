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
import com.zensar.olx.security.jwt.util.JwtUtil;
import com.zensar.olx.service.OlxUserService;

@RestController
public class OlxUserController {

	@Autowired
	OlxUserService service;

	@Autowired
	private AuthenticationManager manager;

	@Autowired
	private JwtUtil util;

	@Autowired
	private AuthenticationManager authManager;


	/**
	 * this is rest url 1 according to doc
	 * 
	 * @param user
	 * @return
	 */

	@PostMapping("/user/authenticate")
	public LoginResponse login(@RequestBody LoginUser loginUser) 
	{
		UsernamePasswordAuthenticationToken authUserPass=new UsernamePasswordAuthenticationToken(loginUser.getUserName(), loginUser.getPassword());
		
		try {
			Authentication authenticate=this.authManager.authenticate(authUserPass);
			String token = util.generateToken(loginUser.getUserName());
			
			//Store the token on server
			//use cache 
			TokenStorage.storeToken(token, token);
			
			LoginResponse userResponse = new LoginResponse();
			userResponse.setJwt(token);
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

	// 5th validate token from document
	@GetMapping("/token/validate")
	public ResponseEntity<Boolean> isValidateUser(@RequestHeader("Authorization") String authToken) {
		try {
			String validateToken = util.validateToken(authToken.substring(7));
			return new ResponseEntity<>(true, HttpStatus.OK);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/user/logout")
	public ResponseEntity<Boolean> logout(@RequestHeader("Authorization") String authToken) 
	{
		String token = authToken.substring(7);

		try {
			//delete the stored token from cache
			TokenStorage.removeToken(token);
			
			ResponseEntity<Boolean> responseEntity = new ResponseEntity<Boolean>(true, HttpStatus.OK);
			return responseEntity;
		} catch (Exception e) 
		{
			ResponseEntity<Boolean> responseEntity = new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}

	}

}
