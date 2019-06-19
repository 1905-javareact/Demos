package com.revature.intercomm;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.revature.models.User;


public class UserClientRestTemplateImpl  implements UserClient{

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return new RestTemplate().getForObject("http://localhost:8085/users", User.class);
	}

}
