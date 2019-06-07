package com.revature.calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calc = new Calculator();
	
	
	@Test
	public void addTest() {
		//we use assert that because it is easier to read and gives better messaging
		//assertTrue(calc.add(2, 4) == 6);
		assertThat(calc.add(2d, 4d), is(equalTo(6d)));
		assertThat(calc.add(2, -2), is(equalTo(0d)));
	}
	
	@Test
	public void subTest() {
		//is an example of a bad test
		//it is not specific enough to what we want the result to be
		assertThat(calc.sub(2d, 4d), is(not(equalTo(0d))));
		//			this is autoboxed to a Double		//this is autoboxed to an Integer
	}
	
	@Before
	public void beforeTest() {
		System.out.println("I come before each Test");
	}
	
	@After
	public void afterTest() {
		System.out.println("I come after each Test");
	}
	
	@BeforeClass
	public static void beforeAll() {
		System.out.println("I run once in the beginning");
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("I run once at the end");
	}

}
