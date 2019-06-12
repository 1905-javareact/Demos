package com.revature.service;

import javax.annotation.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.revature.daos.UserDao;

public class UserService implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	//@Autowired if directly above field will use reflections to inject
	UserDao ud;//this is a dependency 
	
	//@Autowired
	public void setUserDao(UserDao d) {
		this.ud = d;
	}
	
	public UserService() {
		System.out.println("Instantiation");
	}
	
	
	public void destroy() throws Exception {
		System.out.println("This is disposable beans");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Intializing Beans");
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("We are aware of ac " + applicationContext);
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("We are aware of bf " + beanFactory);
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("We are aware of ourname " + name);
	}

	
	@PostConstruct
	public void myInit() {
		System.out.println("custom Init");
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("custom destroy");
	}
	
}
