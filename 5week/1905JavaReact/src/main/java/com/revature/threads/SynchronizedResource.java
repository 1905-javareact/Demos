package com.revature.threads;

public class SynchronizedResource {
	//only one thread can call it at a time
	synchronized void blockingMethod() {
		System.out.println(Thread.currentThread().getName() + "entered resource");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "left resource");
		
	}

}
