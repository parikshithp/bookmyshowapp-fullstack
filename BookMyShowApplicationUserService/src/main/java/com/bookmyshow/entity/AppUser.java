package com.bookmyshow.entity;

import javax.persistence.*;;

@Entity
@Table(name="user_Tks")
public class AppUser {

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int userId;
	
	@Column(name="user_name")
	private String userName;
		
	@Column(name="password")
	private String password;
	
	public AppUser(String userName, String password, String email, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public String email;
	
	@Column(name="user_role")
	private String role;
	
		
	

	public AppUser(int userId, String userName, String password, String email, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.role = role;
	}


	public AppUser() {
		super();
	}
	public AppUser(String userName, String email, String password) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		
		return this.userId;
	}

	@Override
	public boolean equals(Object obj) {
		
		
		if(obj==null || !(obj instanceof AppUser) )
			return false;
		return this.userId==((AppUser)obj).getUserId();
	}
}