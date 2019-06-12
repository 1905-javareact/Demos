package com.revature.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.models.School;
import com.revature.models.Student;
import com.revature.util.HibernateUtil;

public class SchoolDaoImpl implements SchoolDao {

	private SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public boolean save(School school) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(school);
		s.save(school.getLevel());
		for(Student student : school.getStudents()) {
			s.save(student);
		}
		t.commit();
		s.close();
		
		
		return true;
	}

	public School getById(int schoolId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		School school = (School) s.get(School.class, 1);
		System.out.println(school.getStudents());
		school.getLevel();
		t.commit();
		s.close();
		
		return school;
	}

}
