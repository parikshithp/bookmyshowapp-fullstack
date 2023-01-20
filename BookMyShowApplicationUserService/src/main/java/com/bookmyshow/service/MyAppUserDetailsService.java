package com.bookmyshow.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bookmyshow.entity.AppUser;
import com.bookmyshow.repository.UserRepository;
@Service
public class MyAppUserDetailsService implements UserDetailsService{
    @Autowired
	UserRepository userrepository; 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
	    AppUser user=userrepository.findByUserName(username);
	    System.out.println("----------------");
	    System.out.println(user);
	    return new User(user.getUserName(),user.getPassword(),new ArrayList<>());
		
	}
    

}
