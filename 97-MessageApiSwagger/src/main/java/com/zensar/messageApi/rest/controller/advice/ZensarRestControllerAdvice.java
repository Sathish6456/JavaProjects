package com.zensar.messageApi.rest.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ZensarRestControllerAdvice {


	//Following method acts as Generic Exception handler for any of this controller methods of any controller
	//this is how we write generic exception handler
	@ExceptionHandler(Exception.class)
	//public String handleException() 
	public ResponseEntity<String> handleException()
	{	
		System.out.println("In zensarRestControllerAdvice  handle Exception");
		ResponseEntity<String> responseEntity=new ResponseEntity<String>
		("Please try again...",HttpStatus.INTERNAL_SERVER_ERROR);
		return responseEntity;
	}
}
