package com.revature;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.models.Artist;
import com.revature.util.HibernateUtil;

public class HibernateLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		ses.save(new Artist("Dr Dre", 1, 0, "g-funk"));
		t.commit();
		ses.close();
		
		System.out.println("Did we actually run?");
	}

}
