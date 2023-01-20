package com.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.auth.SignUpRequest;
import com.bookmyshow.entity.AppUser;
import com.bookmyshow.repository.UserRepository;
import com.bookmyshow.security.jwt.JwtUtils;
import com.bookmyshow.service.MyAppUserDetailsService;
@RestController
@RequestMapping("/signup")
public class SignUpController {
   @Autowired	
   AuthenticationManager authenticationmanager;
   @Autowired
   MyAppUserDetailsService userDetailsService;
   @Autowired
   JwtUtils jwtutils;
   @Autowired
   UserRepository userrepository;
   @Autowired
   PasswordEncoder encoder;
   @PostMapping("/")
   public void registerUser(@Validated @RequestBody SignUpRequest signUpRequest) {
       
       // Create new user's account
       AppUser user = new AppUser(signUpRequest.getUsername(),
               signUpRequest.getEmail(),
               encoder.encode(signUpRequest.getPassword()));

    

       user.setRole("USER");
       userrepository.save(user);

       
   }

}