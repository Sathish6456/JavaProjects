package com.zensar.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
		
	@GetMapping("/greet/{name}")
	public String sayHello(@PathVariable(name="name")String name) {
		return "Hello.."+name.toUpperCase();
	}
	
}
