package com.revature.services;

import com.revature.models.Credentials;
import com.revature.models.User;

public interface UserService {

	public User login(Credentials cred);
	
}
