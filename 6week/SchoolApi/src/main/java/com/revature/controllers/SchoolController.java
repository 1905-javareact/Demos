package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.revature.models.School;
import com.revature.services.SchoolService;


//@ResponseBody wil convert the return of an endpoint into the response body skipping the find view step
//
//@RestController puts @responsebody above every endpoint
//@Controller tells spring to manage as a bean and that there will be some requestMappings
//@Component //tells spring to manage as a bean
//@Service tells spring to manage as a bean with a different name
//@Repository same as above

@RestController
@RequestMapping("school")
public class SchoolController {

	
	private SchoolService schoolService;
	
	public SchoolController() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Autowired//this is for spring to inject our dependency
	public SchoolController(SchoolService s) {
		this.schoolService = s;
	}
	
	
	@GetMapping
	public List<School> findAll(){
		return schoolService.findAll();
	}
	
	@GetMapping("name/{name}")
	public List<School> findByName(@PathVariable String name){
		return schoolService.findByName(name);
	}
	
	@PostMapping
	public School saveSchool(@Valid @RequestBody School school) {
		return schoolService.save(school);
	}
	//We can use ResponseEntity to do headers and status code and body or any combination thereof

	@GetMapping("level/{level}")
	public List<School> findByEducationLevel(@PathVariable String level){
		return schoolService.findByEducationLevel(level);
	}

}
