package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.revature.intercomm.UserClient;
import com.revature.models.School;

@RestController
@RequestMapping("school")
public class SchoolController {
	
	private School s = new School(1, "JMM", null);
	
	@Autowired
	private UserClient uc;
	
	
	@GetMapping
	public School getSchool() {
		s.setPrincipal(uc.getUser());
		return s;
	}
	

}
