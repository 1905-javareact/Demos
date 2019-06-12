package com.revature.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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

	public List<School> findByName(String name) {
		// TODO Auto-generated method stub
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
									//colon denotes a parameter
		//with hql we can drop the select if we want everything
		Query q = s.createQuery("FROM School WHERE name = :name");
		q.setParameter("name", name);
		List<School> returnSchool = q.list();
		t.commit();
		s.close();
		return returnSchool;
	}

	public List<School> findByEducationLevelLevel(String level) {
	
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
									//colon denotes a parameter
		//with hql we can drop the select if we want everything
		Query q = s.createQuery("FROM School WHERE level.level = :levelParam");
		q.setParameter("levelParam", level);
		List<School> returnSchool = q.list();
		t.commit();
		s.close();
		return returnSchool;
	}

	public List<School> findByAddress(String address) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
									//colon denotes a parameter
		//with hql we can drop the select if we want everything
		Criteria c = s.createCriteria(School.class);//this will give select * from school
		c.add(Restrictions.ilike("address", address));//this is to add things into a where clause
		//we can use restrictions for orderby and having and groupby
		List<School> returnSchool = c.list();
		t.commit();
		s.close();
		return returnSchool;
	}
	
	

}
