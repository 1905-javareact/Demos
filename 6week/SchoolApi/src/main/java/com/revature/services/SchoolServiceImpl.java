package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.School;
import com.revature.repositories.SchoolDao;

@Service
public class SchoolServiceImpl implements SchoolService {

	private SchoolDao schoolDao;
	
	@Autowired
	public SchoolServiceImpl(SchoolDao s) {
		this.schoolDao = s;
	}
	
	
	@Override
	public List<School> findAll() {
		// TODO Auto-generated method stub
		return schoolDao.findAll();
	}


	@Override
	public List<School> findByName(String schoolName) {
		// TODO Auto-generated method stub
		return schoolDao.findByName(schoolName);
	}


	@Override
	public School save(School school) {
		// TODO Auto-generated method stub
		return schoolDao.save(school);
	}


	@Override
	public List<School> findByEducationLevel(String level) {
		// TODO Auto-generated method stub
		return schoolDao.findByLevelLevel(level);
	}

}
