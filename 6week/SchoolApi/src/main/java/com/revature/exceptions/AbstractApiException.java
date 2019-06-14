package com.revature.exceptions;

import org.springframework.http.HttpStatus;

public abstract class AbstractApiException extends RuntimeException{
	HttpStatus status;
	String message;
	
	public AbstractApiException(HttpStatus hs) {
		this.status = hs;
		// TODO Auto-generated constructor stub
	}
	
	public AbstractApiException(HttpStatus hs, String message) {
		this.status = hs;
		this.message = message;
		// TODO Auto-generated constructor stub
	}
	
	public HttpStatus getStatus() {
		return this.status;
	}
	
	public String getMessage() {
		return this.message;
	}
	

}
