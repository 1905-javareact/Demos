package com.revature.strings;

public class StringLauncher {
	
	public static void main(String[] args) {
		
		String s1 = "hello";//is a string in the string pool
		
		String s2 = "hello";//same string as s1 in the string pool
		
		System.out.println(s1==s2);//way we expect the string pool to work
		
		String s3 = "he" + "llo";//still goes into the string pool
		
		System.out.println(s1==s3);
		
		String s4 = "h";//a new string in pool
		
		String s5 = "ello";//another new string in the pool
		
		String s6 = s4 + s5;//didn't end up in the string pool
		
		System.out.println(s1 == s6);//this will always be false everytime
		
		String s7 = "helloworld".substring(0, 5);
		
		System.out.println(s1 == s7);//false
		
		System.out.println(s1.equals(s7));//
		//hello in the pool being refrenced by s1 s2 and s3
		//hello out of the pool being refrenced by s7
		s7 = s7.intern();
		//hello in ghe pool being refrenced by s1 s2 s3 and s7
		//hello out the pool being refrenced by nothing
		System.out.println(s1 == s7);
		
		StringBuilder sb;
		StringBuffer sb2;
		
	}

}
