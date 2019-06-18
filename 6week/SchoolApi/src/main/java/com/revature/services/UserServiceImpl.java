package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Credentials;
import com.revature.models.User;
import com.revature.repositories.UserDao;

@Service
public class UserServiceImpl implements UserService {

	
	private UserDao ud;
	
	@Autowired
	public UserServiceImpl(UserDao ud) {
		this.ud = ud;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public User login(Credentials cred) {
		// TODO Auto-generated method stub
		return ud.findByUsernameAndPassword(cred.getUsername(), cred.getPassword());
	}

}
