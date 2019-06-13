package com.revature.repositories;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.models.EducationLevel;
import com.revature.models.School;
import com.revature.models.Student;


@Repository
public class SchoolDaoImpl implements SchoolDao{

	@Override
	public School save(School school) {
		// TODO Auto-generated method stub
		return school;
	}

	@Override
	public School getById(int schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<School> findByName(String name) {
		// TODO Auto-generated method stub
		School s = new School();
		s.setAddress("Reston, Virginia");
		s.setFun(5);
		s.setSchoolId(0);
		s.setName("South Lakes High School");
		
			EducationLevel high = new EducationLevel(0, "High");
			s.setLevel(high);
			Student robert = new Student(0, "Robert");

			s.setStudents(new HashSet<Student>());
			s.getStudents().add(robert);
			School s2 = new School();
			s2.setAddress("Reston, Virgina");
			s2.setFun(2);
			s2.setName("Armstrong");
			s2.setSchoolId(0);
			s2.setStudents(new HashSet<Student>());
			s2.getStudents().add(robert);
			EducationLevel elementary = new EducationLevel(0, "Elementary");
			s2.setLevel(elementary);
			List<School> l = new ArrayList<>();
			l.add(s);
			l.add(s2);
		
		
		return l;
	}

	@Override
	public List<School> findByEducationLevelLevel(String level) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<School> findByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<School> findAll() {
		// TODO Auto-generated method stub
		School s = new School();
		s.setAddress("Reston, Virginia");
		s.setFun(5);
		s.setSchoolId(0);
		s.setName("South Lakes High School");
		
			EducationLevel high = new EducationLevel(0, "High");
			s.setLevel(high);
			Student robert = new Student(0, "Robert");

			s.setStudents(new HashSet<Student>());
			s.getStudents().add(robert);
			School s2 = new School();
			s2.setAddress("Reston, Virgina");
			s2.setFun(2);
			s2.setName("Armstrong");
			s2.setSchoolId(0);
			s2.setStudents(new HashSet<Student>());
			s2.getStudents().add(robert);
			EducationLevel elementary = new EducationLevel(0, "Elementary");
			s2.setLevel(elementary);
			List<School> l = new ArrayList<>();
			l.add(s);
			l.add(s2);
		return l;
	}

}
