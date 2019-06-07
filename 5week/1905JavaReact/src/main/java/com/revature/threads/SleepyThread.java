package com.revature.threads;

public class SleepyThread implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		
			try {
				System.out.println("Sleepy Thread is going to sleep");
				Thread.sleep(3000);
				System.out.println("Sleepy thread wishes you a good morning");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	

}
