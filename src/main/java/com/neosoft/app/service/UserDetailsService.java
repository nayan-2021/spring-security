package com.neosoft.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.neosoft.app.entity.User;
import com.neosoft.app.repository.UserRepo;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
	@Autowired
	UserRepo repo;

	public UserDetails loadUserByUsername(String username) {
		User user = repo.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("user not found with name:" + username));
		return new UserDetailsImpl(user);
	}

}
