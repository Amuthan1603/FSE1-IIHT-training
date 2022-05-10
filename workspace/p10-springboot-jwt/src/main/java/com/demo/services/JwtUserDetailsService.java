package com.demo.services;


import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // spring-security will find user from db
        // you can write jdbc code

		if ("demo".equals(username)) {
			// return new User("demo", "{noop}demo@123", new ArrayList<>());
			// return new User("demo", "{bcrypt}$2a$10$HpRDgXNLCa22nW4eCQuETuB4qOu02.Lln/qyugx3Kw3jtP.Xy7JvS", new ArrayList<>());
			return new User("demo", "$2a$10$HpRDgXNLCa22nW4eCQuETuB4qOu02.Lln/qyugx3Kw3jtP.Xy7JvS", new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}