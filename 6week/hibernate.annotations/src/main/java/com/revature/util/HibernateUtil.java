package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sf;
	
	static {
		Configuration c = new Configuration().configure("hibernate.cfg.xml");
		c.setProperty("hibernate.connection.username", System.getenv("DB_USERNAME"));
		c.setProperty("hibernate.connection.password", System.getenv("DB_PASSWORD"));
		
		sf = c.buildSessionFactory();	
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}
	

}
