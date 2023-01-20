package com.bookmyshow.auth;


public class LoginRequest {
    private String userName;
    private String password;
	public LoginRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public LoginRequest() {
		super();
	}

	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPasword(String password) {
		this.password = password;
	}
    
}
