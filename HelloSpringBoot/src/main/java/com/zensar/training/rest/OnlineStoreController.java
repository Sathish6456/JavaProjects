package com.zensar.training.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.training.OnlineStores;

@RestController
public class OnlineStoreController {

	@RequestMapping("/Laptops")
	List<OnlineStores> getAllLaptops(){
	return Arrays.asList(
			new OnlineStores(1,"lennovo","Yang"),
			new OnlineStores(2, "Apple", "Nadendla"),
			new OnlineStores(3, "HP", "MEG Whitman")
			);
}
		
	
	
	
}