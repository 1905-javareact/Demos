package com.revature.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.revature.models.User;

@Component
public class LoggedInUserGetterImpl implements LoggedInUserGetter {
	
	public User getLoggedInUser() {
		HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return (User) req.getSession().getAttribute("user");
	}
	
	
}
