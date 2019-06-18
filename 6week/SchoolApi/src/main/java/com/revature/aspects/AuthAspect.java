package com.revature.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.revature.annotations.AuthAnn;
import com.revature.exceptions.UnathorizedException;
import com.revature.models.User;
import com.revature.util.LoggedInUserGetter;

@Aspect
@Component
public class AuthAspect {
	
	
	private LoggedInUserGetter lg;
	@Autowired
	public AuthAspect(LoggedInUserGetter lg) {
		this.lg = lg;
	}
	
	
	@Around("@annotation(auth) && execution(* com.revature.controllers..*(..))")//learn more about p[ointcut expressions look up aspectJ documentation
	public Object authenticateUser(ProceedingJoinPoint pjp, AuthAnn auth ) throws Throwable {
		User currentUser = lg.getLoggedInUser();
		System.out.println(currentUser);
		if(currentUser == null) {
			throw new UnathorizedException(HttpStatus.FORBIDDEN, "You are unathorized for this end point");
		} else {
			for(String role : auth.roles()) {
				if(currentUser.getRole().equals(role) ) {
					return pjp.proceed();
				}
			}
			throw new UnathorizedException(HttpStatus.FORBIDDEN, "You are unathorized for this end point");
		}
	}
	
	
}
