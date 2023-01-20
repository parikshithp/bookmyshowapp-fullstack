package com.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.auth.LoginRequest;
import com.bookmyshow.auth.LoginResponse;
import com.bookmyshow.security.jwt.JwtUtils;
import com.bookmyshow.service.MyAppUserDetailsService;

@RestController
@RequestMapping("/login")
public class AuthenticationController {
   @Autowired	
   AuthenticationManager authenticationmanager;
   @Autowired
   MyAppUserDetailsService userDetailsService;
   @Autowired
   JwtUtils jwtutils;
   @PostMapping("/")
   public LoginResponse login(@RequestBody LoginRequest loginrequest) throws Exception {
	   try {
	  // authenticationmanager.authenticate(new UsernamePasswordAuthenticationToken(loginrequest.getUsername(), loginrequest.getPassword()));
	   Authentication authentication = authenticationmanager.authenticate(
               new UsernamePasswordAuthenticationToken(loginrequest.getUsername(), loginrequest.getPassword()));

	   }
	   catch(BadCredentialsException e) {
		   throw new Exception("Bad Credentials...");
	   }
	   UserDetails userDetails=userDetailsService.loadUserByUsername(loginrequest.getUsername());
	   String jwt=jwtutils.generateToken(userDetails);
	   return new LoginResponse(jwt);
	   
}
}   
