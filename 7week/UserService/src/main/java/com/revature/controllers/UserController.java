package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.User;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Value("${custom.property}")
	private String custom;
	
	@GetMapping
	public User getUser() {
		return new User(custom, "Roasted Pineapple");
	}
}
