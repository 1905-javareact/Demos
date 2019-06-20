package com.revature.intercomm;

import org.springframework.stereotype.Component;

import com.revature.models.User;

@Component
public class UserClientFallback implements UserClient{

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
