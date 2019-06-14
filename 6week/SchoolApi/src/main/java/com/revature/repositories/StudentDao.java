package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{

	public List<Student> findByName(String name);
}
