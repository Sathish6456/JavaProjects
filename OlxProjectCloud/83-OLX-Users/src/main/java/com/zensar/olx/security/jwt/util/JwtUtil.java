package com.zensar.olx.security.jwt.util;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Component
public class JwtUtil {
	
	private long expirationtime=900000*10;
	private final String SECRET_KEY="zensar";
	
	public String generateToken(String username) {
		return JWT.create()
		          .withClaim("username", username)
		          .withExpiresAt(new Date(System.currentTimeMillis()+expirationtime))
		          .sign(Algorithm.HMAC512(SECRET_KEY));
	}
	public String validateToken(String token) {
		return JWT.require(Algorithm.HMAC512(SECRET_KEY))
		.build()
		.verify(token)
		.getPayload();
		
	}

}
