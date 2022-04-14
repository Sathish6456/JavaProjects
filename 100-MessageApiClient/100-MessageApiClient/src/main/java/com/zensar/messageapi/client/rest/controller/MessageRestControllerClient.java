package com.zensar.messageapi.client.rest.controller;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.messageapi.client.web.request.UserRequest;
import com.zensar.messageapi.client.web.response.UserResponse;

@RestController
@RequestMapping("/api/messageClient")
public class MessageRestControllerClient {

	@GetMapping
	public String fetchMessages() {
		// Todo
		// Fetch all messages from server application running on port 8080
		// RestTemplate is class given by spring
		// It is used for consuming web service

		RestTemplate rt = new RestTemplate();
		UserRequest userRequest = new UserRequest();
		userRequest.setUsername("zensar");
		userRequest.setPassword("zensar");
		
		// To call http://localhost:8080/api/user/authenticate--for POST
		UserResponse userResponse = rt.postForObject("http://localhost:8080/api/user/authenticate", userRequest,
				UserResponse.class);

		// Fetch token
		System.out.println(userResponse.getJwt());

		// pass token using Authorization header while accessing http://localhost:8080/api/user/authenticate
		HttpHeaders headers=new HttpHeaders();	
		headers.add("Authorization", "Bearer "+userResponse.getJwt());
		HttpEntity<String> entity=new HttpEntity<String>(headers);
		
		String response=rt.exchange("http://localhost:8080/api/message",
				HttpMethod.GET,
				entity,
				String.class).getBody();
		
		// String
		// response=rt.getForObject("http://localhost:8080/api/message",String.class);
		System.out.println(response);

		return "Fetch Data"+ response;
	}
	
	@GetMapping("/{id}")
	public String fetchMessageById(@PathVariable int id) {
		
		RestTemplate rt = new RestTemplate();
		UserRequest userRequest = new UserRequest();

		userRequest.setUsername("zensar");
		userRequest.setPassword("zensar");

		UserResponse userResponse = rt.postForObject("http://localhost:8080/api/user/authenticate", userRequest,
				UserResponse.class);
		System.out.println(userResponse.getJwt());

		HttpHeaders headers=new HttpHeaders();	
		headers.add("Authorization", "Bearer "+userResponse.getJwt());
		HttpEntity<String> entity=new HttpEntity<>(headers);
		String response=rt.exchange("http://localhost:8080/api/message/"+ id,
				HttpMethod.GET,
				entity,
				String.class).getBody();
		System.out.println(response);
		return "Fetch Data"+ response;	
	}
}
