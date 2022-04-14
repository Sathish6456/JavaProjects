package com.zensar.messageApi.rest.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ZensarRestControllerAdvice {

	//Following method acts 
	@ExceptionHandler(Exception.class)				
	//public String handleException() {
	public ResponseEntity<String> handleException() {
		
		System.out.println("In Handle Exception ");
		//return "Please Try Again";
		ResponseEntity<String> responseEntity= new ResponseEntity<String>("Please try again...",HttpStatus.INTERNAL_SERVER_ERROR);
		return responseEntity;
	}
}
