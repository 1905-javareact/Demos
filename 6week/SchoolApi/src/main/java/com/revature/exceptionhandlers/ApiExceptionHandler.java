package com.revature.exceptionhandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.revature.exceptions.StudentIdNotFoundException;

@ControllerAdvice
public class ApiExceptionHandler {
	
	
	@ExceptionHandler(value = {StudentIdNotFoundException.class})
	public ResponseEntity<Object> studentIdNotFound(StudentIdNotFoundException e){
		System.out.println(e);
		return new ResponseEntity<Object>(e.getMessage(), e.getStatus());
		
	}
	
	@ExceptionHandler(value = {Throwable.class})
	public ResponseEntity<Object> catchAll(Throwable e){
		System.out.println(e);
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
