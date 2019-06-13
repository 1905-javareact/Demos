package com.revature.repositories;

import java.util.List;

import com.revature.models.School;

public interface SchoolDao {
	
	public School save(School school);
	
	public School getById(int schoolId);
	
	public List<School> findByName(String name);
	
	public List<School> findByEducationLevelLevel(String level);
	
	public List<School> findByAddress(String address);
	
	public List<School> findAll();

}
