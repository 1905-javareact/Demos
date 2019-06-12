package com.revature;

import java.util.HashSet;

import com.revature.daos.SchoolDao;
import com.revature.daos.SchoolDaoImpl;
import com.revature.models.EducationLevel;
import com.revature.models.School;
import com.revature.models.Student;

public class AnnotationLauncher {

	private static SchoolDao schoolDao = new SchoolDaoImpl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateValues();
		System.out.println("we made some values");
		System.out.println(schoolDao.getById(1));
		

	}

	
	public static void generateValues() {
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
		
		schoolDao.save(s);
	}
	
}
