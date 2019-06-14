package com.revature.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.revature.exceptions.StudentIdNotFoundException;
import com.revature.models.Student;
import com.revature.repositories.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	
	private StudentDao sd;
	
	@Autowired
	public StudentServiceImpl(StudentDao s) {
		this.sd = s;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return sd.findAll();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> s = sd.findById(id);
		if(s.isPresent()) {
			return s.get();
		}else {
			throw new StudentIdNotFoundException(HttpStatus.NOT_FOUND, "That student never attended school");
		}
	}

	@Override
	public List<Student> findByName(String name) {
		// TODO Auto-generated method stub
		return sd.findByName(name);
	}

}
