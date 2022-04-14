package com.zensar.messageApi.security.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageApi.entity.ZensarUser;

@RestController
@RequestMapping("/api/user")
public class ZensarUserRestController {
	
	@GetMapping
	public List<ZensarUser> findAll(){
		throw new RuntimeException();	
	}
}
