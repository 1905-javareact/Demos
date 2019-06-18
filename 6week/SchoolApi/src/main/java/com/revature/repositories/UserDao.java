package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.User;

public interface UserDao extends JpaRepository<User, Integer>{
	public User findByUsernameAndPassword(String username, String password);
}
