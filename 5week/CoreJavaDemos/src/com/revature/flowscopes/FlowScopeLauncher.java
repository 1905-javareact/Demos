package com.revature.flowscopes;

public class FlowScopeLauncher {

	private static String x = "Class variable";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(x);
		
		do {
			String x = "Block Variable";
			System.out.println(x);
		} while (false);
		
		FlowScopeLauncher.scope("Method variable");
		
//		if(x) {
//			
//		} this wont compile because x is a string and we need true or false in flow context
		boolean b = x == "" && x != "";
		
		//wont compile, && and || need to be used between booleans
		//String s = x || "default";
//		if(false){
//			
//		}else if(true){
//			
//		}else {
//			
//		}
		
//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		int i = 0;
		for(; i < 10 ; ) {
			
		}

	}
	public static void scope(String x) {
		System.out.println(x);
	}

}
