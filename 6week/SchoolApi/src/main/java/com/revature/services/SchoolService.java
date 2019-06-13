package com.revature.services;

import java.util.List;

import com.revature.models.School;

public interface SchoolService {

	
	public List<School> findAll();
	
	public List<School> findByName(String schoolName);
	
	public School save(School school);
}
