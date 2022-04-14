package com.zensar.olx.security.jwt.filter;

import java.io.IOException;
import java.util.Base64;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.zensar.olx.db.TokenStorage;
import com.zensar.olx.security.jwt.util.JwtUtil;

//This is Custom Filter
//You need to add This Filter in Spring Security Filter chain otherwise it is not Excecuted

public class JWTAuthenticationFilter extends BasicAuthenticationFilter {

// Authorization is predefined HTTP header
	private String authorizationHeader = "Authorization";

	private final String BEARER = "Bearer ";

	public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		JwtUtil jwtUtil = new JwtUtil();

		System.out.println("IN doFilterInternal");
// 1. Check if user has passed token , we do that by fetching value from
// Authentication header
		String authorizationHeaderValue = request.getHeader(authorizationHeader);

// if token is not passed or it doesnot start eith bearer
// Don't do anything proceed to next filter in chain
		if (authorizationHeaderValue == null || !authorizationHeaderValue.startsWith(BEARER)) {
			chain.doFilter(request, response);// invoke next security filter in chain
			return;
		}

		String token = authorizationHeaderValue.substring(7).trim();// we want to remove "bearer " from token value

// if token is null means user has loggedout
		String tokenExists = TokenStorage.getToken(token);
//
		if (tokenExists == null) {
			chain.doFilter(request, response);
			return;
		}

		if (authorizationHeaderValue != null && authorizationHeaderValue.startsWith(BEARER)) {

// Bearer -This i s prefix to token value this is predefined

			if (token != null) {

// Authorization Bearer token
				System.out.println("authorizationHeaderValue >>>>>>" + authorizationHeaderValue);
				System.out.println("TokenValue >>>>>>" + token);

				try {
// validate the token
					String encodedPayload = jwtUtil.validateToken(token);

// If Token is valid
					String payload = new String(Base64.getDecoder().decode(encodedPayload));

// From this payload we need to fetch userName
					JsonParser jsonParser = JsonParserFactory.getJsonParser();
					Map<String, Object> parseMap = jsonParser.parseMap(payload);
					String username = (String) parseMap.get("username");

// create UsernamePasswordAuthenticationTooken
					UsernamePasswordAuthenticationToken authenticationToken;
					authenticationToken = new UsernamePasswordAuthenticationToken(username, null,
							AuthorityUtils.createAuthorityList("ROLE_USER"));

// Authenticate User
					SecurityContextHolder.getContext().setAuthentication(authenticationToken);
				} catch (Exception e) {
// If token is not valid
					e.printStackTrace();
				}
			}
		}
		chain.doFilter(request, response);
	}
}
