package com.revature.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
public @interface AuthAnn {
	public String[] roles();//looks strange
	//this methods is a getter for a string array of roles specified in the annotation declaration

}
