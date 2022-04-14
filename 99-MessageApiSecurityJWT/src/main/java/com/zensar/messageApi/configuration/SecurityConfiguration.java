package com.zensar.messageApi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.zensar.messageApi.security.jwt.filter.JWTAuthenticationFilter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	//UserDetailsService is an interface given by spring security
	//this interface has only one method loadUserByUserName(String userName)
	//This method is responsible for loading the user object form database
	//If user object couldn't found in database this method should throw userName not found exception
	//It is responsibility of developer to give implementation of interface
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(getPasswordEncoder());
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.csrf()
		.disable()
		.authorizeRequests()
		.antMatchers(HttpMethod.POST,"/api/user/authenticate")			//this url must be public so that user can login 
		.permitAll()
		.antMatchers(HttpMethod.OPTIONS,"/**")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.addFilter(new JWTAuthenticationFilter(authenticationManager()))
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);	//This is must for REST Webservices 
																	//REST should be Stateless 
	}
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		BCryptPasswordEncoder passwordencoder=new BCryptPasswordEncoder();
		return passwordencoder;
		
	}
}
