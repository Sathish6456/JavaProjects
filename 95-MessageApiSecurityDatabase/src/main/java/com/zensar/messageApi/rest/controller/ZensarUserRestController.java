package com.zensar.messageApi.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageApi.entity.ZensarUser;

@RestController
@RequestMapping("/api/user")
public class ZensarUserRestController {

	//try accessing http://localhost:8080/api/user
	@GetMapping
	public List<ZensarUser> findAll(){
		throw new RuntimeException();
	}
}
