package com.bookmyshow.auth;

import org.springframework.stereotype.Component;

@Component
public class LoginResponse {
    private String jwt;

	public LoginResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	public LoginResponse() {
		super();
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	
    
}
