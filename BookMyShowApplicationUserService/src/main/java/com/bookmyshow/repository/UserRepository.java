package com.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.entity.AppUser;
@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {
		
	public AppUser findByUserName(String userName);
	
}