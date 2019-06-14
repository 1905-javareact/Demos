package com.revature.services;

import java.util.List;

import com.revature.models.Student;

public interface StudentService {

	public List<Student> findAll();
	
	public Student findById(int id);
	
	public List<Student> findByName(String name);
	
	
}
