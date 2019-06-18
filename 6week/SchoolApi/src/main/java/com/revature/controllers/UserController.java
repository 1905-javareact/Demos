package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Credentials;
import com.revature.models.User;
import com.revature.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	private UserService us;
	
	@Autowired
	public UserController(UserService us) {
		this.us = us;
	}
	
	@PostMapping("login")
	public User login(@RequestBody Credentials cred, HttpServletRequest req) {
		User user = us.login(cred);
		req.getSession().setAttribute("user", user);
		
		return user;
		
	}

}
