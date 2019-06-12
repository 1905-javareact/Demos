package com.revature.daos;

import com.revature.models.School;

public interface SchoolDao {
	
	public boolean save(School school);
	
	public School getById(int schoolId);

}
