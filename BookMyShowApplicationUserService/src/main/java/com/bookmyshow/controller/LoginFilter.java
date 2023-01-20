package com.bookmyshow.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/login/next")
public class LoginFilter {
	    @GetMapping("/user")
	    @PreAuthorize("hasRole('USER')")
	    public String userAccess() {
	        return "User Content.";
	    }

}

