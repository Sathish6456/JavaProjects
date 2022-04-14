package com.zensar.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloClientController {
	
		@GetMapping("/sayHello")
		public String f1() {
			
			RestTemplate restTemplate;
			restTemplate=new RestTemplate();
			String retVal=restTemplate.getForObject("http://localhost:8082/greet/Sathish", String.class);
			return retVal;
		}
}
