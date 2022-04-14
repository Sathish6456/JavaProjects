package com.zensar.olx.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zensar.olx.bean.OlxUser;
import com.zensar.olx.db.OlxUserDAO;

@Service
public class OlxUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private OlxUserDAO dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// To-do talk to database and fetch user details
		OlxUser foundUser = dao.findByUserName(username);
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

		String roles=foundUser.getRoles();
		User authenticatedUser = new User(foundUser.getUserName(), foundUser.getPassword(),
				AuthorityUtils.createAuthorityList(roles));
		return authenticatedUser;
		// }
		// throw new UsernameNotFoundException(username);
	}

}
