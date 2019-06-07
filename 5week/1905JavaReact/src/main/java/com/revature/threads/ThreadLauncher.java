package com.revature.threads;

public class ThreadLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread bT = new BasicThread();
		Thread bR = new Thread(new BasicRunnable());
		
		bT.start();
		bR.start();
		
		while(true) {
			System.out.println("I am the Main Thread");
		}
		
	}

}
