package com.revature.exceptions;

import org.springframework.http.HttpStatus;

public class UnathorizedException extends AbstractApiException {

	public UnathorizedException(HttpStatus hs) {
		super(hs);
		// TODO Auto-generated constructor stub
	}

	public UnathorizedException(HttpStatus hs, String message) {
		super(hs, message);
		// TODO Auto-generated constructor stub
	}

}
