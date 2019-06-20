package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<School> getSchool() {
		s.setPrincipal(uc.getUser());
		if(s.getPrincipal() == null) {
			return new ResponseEntity<School>(s, HttpStatus.PARTIAL_CONTENT);
			
		}else {
			return new ResponseEntity<School>(s, HttpStatus.OK);
		}
		
	}
	

}
