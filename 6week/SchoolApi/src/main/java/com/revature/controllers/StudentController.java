package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Student;
import com.revature.services.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	StudentService ss;
	
	@Autowired
	public StudentController(StudentService s) {
		// TODO Auto-generated constructor stub
		this.ss = s;
	}
	
	@GetMapping
	public List<Student> findAll(){
		return ss.findAll();
	}
	
	@GetMapping("id/{id}")
	public Student findById(@PathVariable int id) {
		return ss.findById(id);
	}
	
	@GetMapping("name/{name}")
	public List<Student> findByName(@PathVariable String name){
		return ss.findByName(name);
	}

}
