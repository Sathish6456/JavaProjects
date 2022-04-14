
package com.zensar.olx.filter.jwt.util;

import java.util.Date;
import org.springframework.stereotype.Component;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Component
public class JwtUtil {
	private long expirationtime=600000*10;
	private final String SECRET_KEY="zensar@12345";
	//secret key is very sensitive,complex should not be shared with anyone 
	public String generateToken(String username) {
		return JWT.create().withClaim("usernname", username)
				.withExpiresAt(new Date(System.currentTimeMillis() + expirationtime))
				.sign(Algorithm.HMAC512(SECRET_KEY));
	}

	public String validateToken(String token) {
		
		return JWT.require(Algorithm.HMAC512(SECRET_KEY))
				.build() 
				.verify(token)
				.getPayload();
		
	}
}
