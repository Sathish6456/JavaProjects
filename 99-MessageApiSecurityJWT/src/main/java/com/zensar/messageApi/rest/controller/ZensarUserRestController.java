package com.zensar.messageApi.rest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageApi.dto.UserRequest;
import com.zensar.messageApi.dto.UserResponse;
import com.zensar.messageApi.security.jwt.util.JwtUtil;

@RestController

public class ZensarUserRestController {

	@Autowired
	private AuthenticationManager manager;

	@Autowired
	private JwtUtil util;

	// we are accepting username and password from user request body
	@PostMapping("/api/user/authenticate")
	public UserResponse login(@RequestBody UserRequest userRequest) {
		System.out.println(userRequest);
		// 1.Authenticate User
		UsernamePasswordAuthenticationToken authenticationToken;
		authenticationToken = new UsernamePasswordAuthenticationToken(userRequest.getUserName(),
				userRequest.getPassword());
		try {
			manager.authenticate(authenticationToken);

			String token = util.generateToken(userRequest.getUserName());

			UserResponse userResponse=new UserResponse();
			userResponse.setJwt(token);
			return userResponse;
		} catch (Exception e) {
			throw e;
		}
		// 2.If user is authenticated generate token and return it

		// 3.if user is not authenticated throw exception

	}

}