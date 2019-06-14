package com.revature.exceptions;

import org.springframework.http.HttpStatus;

public class StudentIdNotFoundException extends AbstractApiException {

	public StudentIdNotFoundException(HttpStatus hs) {
		super(hs);
		// TODO Auto-generated constructor stub
	}
	
	public StudentIdNotFoundException(HttpStatus hs, String message) {
		super(hs, message);
		// TODO Auto-generated constructor stub
	}
	

}
