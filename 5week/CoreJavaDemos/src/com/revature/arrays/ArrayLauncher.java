package com.revature.arrays;

import java.util.Arrays;

public class ArrayLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[5];//this is the syntax for making an empty array of a size

		System.out.println(numbers);//calling array .tostring 
		//can only be used with things that implement Iterable, or arrays
		for(int num : numbers) { // enhanced for loop, it will make an iterator to go through the object on the left and get each element in it
			System.out.println(num);
		}
		
		numbers[2] = 12;
		System.out.println("edited");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//Arrays class contains static methods for manipulating arrays
		//thing like sorting and tostring and copying etc...
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(numbers[-1]);
		
		
		
	}

}
