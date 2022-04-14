package com.zensar.messageApi.security.service;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zensar.messageApi.entity.ZensarUser;
import com.zensar.messageApi.repository.ZensarUserRepository;

@Service
public class ZensarUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private ZensarUserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// To-do talk to database and fetch user details
		ZensarUser foundUser = repo.findByUsername(username);
		if (foundUser == null) {
			throw new UsernameNotFoundException(username);
		}
		System.out.println("In loadUserByUsername");
		// UserDetails is an Interface given by spring security
		// We are free to implement interfaces but for simplicitly spring security has
		// given a class which
		// implements UserDetails information
		// Name of the class is User
		// In this method we need to create an object of User and return it.
		// if(username.equals("zensar")) {

		User authenticatedUser = new User(foundUser.getUsername(), foundUser.getPassword(),
				AuthorityUtils.createAuthorityList("ROLE_USER"));
		return authenticatedUser;
		// }
		// throw new UsernameNotFoundException(username);
	}

}
