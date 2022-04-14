package com.zensar.messageapi.client.web.response;

//This is client class to receive response from server application
public class UserResponse {
	private String jwt;

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	
	
}
