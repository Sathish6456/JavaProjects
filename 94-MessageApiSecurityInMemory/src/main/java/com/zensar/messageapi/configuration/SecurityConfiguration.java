package com.zensar.messageapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	//following Bean is used for Password Encoding
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		BCryptPasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
		return passwordEncoder;
	}
	
	//Authentication- username,password
	//Ask to user to prove whoever user is claiming user 
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()	//we are storing credentials in Memory 
		.withUser("zensar")
		.password("$2a$10$1OQoynrxriPHcvTV2DGSFu3D3SEabf983gYrGWLebovY4AYRWovHC")		//
										//password // this is bad to stored password in plain text
										//We must store password in encoded from
										//BCryptPasswordEncodder is recommended for password emcoding
		.roles("USER")
		.and()
		.passwordEncoder(getPasswordEncoder());	//this line tells spring security to use BCryptPasswordEncoder 
	}
	
	//Authorization - specifying access rights to a resource  
	//Access based on Roles
	//What are you allowed to do ?

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS, "/**")
		.permitAll().anyRequest()
		.authenticated()
		.and().httpBasic();
	}
}
