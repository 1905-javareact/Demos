package com.revature.primitives;

public class PrimitiveLauncher {

	
	public static void main(String[] args) {
		byte b = 127;
		
		System.out.println("b= " + b);//our strings must be in double quotes
		
		char c = 110;//character letter n
		
		System.out.println("c= " + c);
		c = 't';//single quotes are for single characters
		System.out.println("c= " + c);//we are doing string concatenation 
										//we are adding values to our string
		
		short s = 25;
		System.out.println("s= "+s);
		
		int i = 9005;
		System.out.println("i= " + i);
		
		long l = 2200000000L;
		System.out.println("l= " +l);
		
		float f = 19.57f;
		System.out.println("f= " +f);
		
		double d = 178.0;
		System.out.println("d= " +d);
		
		boolean bool = true;
		
		System.out.println("bool= " + bool + " this is an example");
		
	}
}
