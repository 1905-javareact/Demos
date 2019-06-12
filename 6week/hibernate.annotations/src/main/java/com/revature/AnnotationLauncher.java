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
		//generateValues();
		System.out.println("we made some values");
		System.out.println(schoolDao.getById(1));
		
		System.out.println(schoolDao.findByName("Armstrong"));
		System.out.println(schoolDao.findByEducationLevelLevel("High"));
		System.out.println(schoolDao.findByAddress("Rest%"));
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
		School s2 = new School();
			s2.setAddress("Reston, Virgina");
			s2.setFun(2);
			s2.setName("Armstrong");
			s2.setSchoolId(0);
			s2.setStudents(new HashSet<Student>());
			s2.getStudents().add(robert);
		EducationLevel elementary = new EducationLevel(0, "Elementary");
			s2.setLevel(elementary);
		schoolDao.save(s);
		schoolDao.save(s2);
	}
	
}
