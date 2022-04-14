package com.zensar.messageApi.security.jwt.filter;

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

import com.zensar.messageApi.security.jwt.util.JwtUtil;

//This is custom filter
//you need to add this filter in spring security filter chain otherwise it is not executed

public class JWTAuthenticationFilter extends BasicAuthenticationFilter {

	private String authorizationHeader = "Authorization";
	private final String BEARER = "Bearer ";

	public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		JwtUtil jwtUtil = new JwtUtil();
		System.out.println("In doFilterInternal");
// 1.Check if user has passed token,we do that by fetching value from
// authorization header
		String authorizationHeaderValue = request.getHeader(authorizationHeader);
		if (authorizationHeaderValue == null || !authorizationHeaderValue.startsWith(BEARER)) {
			chain.doFilter(request, response);
			return;
		}
		if (authorizationHeaderValue != null && authorizationHeaderValue.startsWith(BEARER)) {
// Bearer
			String token = authorizationHeaderValue.substring(7); // we are removing

			if (token != null) {
				// Authorization Bearer token
				System.out.println("authorizationHeaderValue------->" + authorizationHeaderValue);
				System.out.println("Token value--------------->" + token);

				// validate token
				try {
					// validate the token
					String payload = jwtUtil.validateToken(token);
					// if token is valid
					String actualPayload = new String(Base64.getDecoder().decode(payload));
					// from this payload we need to fetch username
					JsonParser jsonParser = JsonParserFactory.getJsonParser();
					Map<String, Object> parseMap = jsonParser.parseMap(actualPayload);
					String username = (String) parseMap.get("username");
					// create Username and password Authentication Token
					UsernamePasswordAuthenticationToken authenticationToken;
					authenticationToken = new UsernamePasswordAuthenticationToken(username, null,
							AuthorityUtils.createAuthorityList("ROLE_USER"));
					// Authenticate user
					SecurityContextHolder.getContext().setAuthentication(authenticationToken);
				} catch (Exception e) {
					// if token is not valid
					e.printStackTrace();
				}
				// 2.If token not present ask user to login

				// 3.If token present fetch it and validates it

			}

		}
		chain.doFilter(request, response);
	}
}