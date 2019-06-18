package com.revature.exceptionhandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException.Unauthorized;

import com.revature.exceptions.StudentIdNotFoundException;
import com.revature.exceptions.UnathorizedException;

@ControllerAdvice
public class ApiExceptionHandler {
	
	
	@ExceptionHandler(value = {StudentIdNotFoundException.class})
	public ResponseEntity<Object> studentIdNotFound(StudentIdNotFoundException e){
		System.out.println(e);
		return new ResponseEntity<Object>(e.getMessage(), e.getStatus());
		
	}
	
	@ExceptionHandler(value = {UnathorizedException.class})
	public ResponseEntity<Object> unathorizedUser(UnathorizedException e){
		System.out.println(e);
		return new ResponseEntity<Object>(e.getMessage(), e.getStatus());
	}
	
	@ExceptionHandler(value = {Throwable.class})
	public ResponseEntity<Object> catchAll(Throwable e){
		System.out.println(e);
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
