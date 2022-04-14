package com.zensar.messageapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloworld(Model m) {
		m.addAttribute("key", "Welcome To Thymeleaf");
		return "helloworld";
	}
	
	@GetMapping("/style")
	public String style() {
		return "helloworld";
	}

}
