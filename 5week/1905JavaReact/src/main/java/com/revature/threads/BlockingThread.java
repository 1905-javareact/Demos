package com.revature.threads;

public class BlockingThread implements Runnable {
	
	SynchronizedResource s1;
	SynchronizedResource s2;
	
	public BlockingThread(SynchronizedResource s1, SynchronizedResource s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "Trying to use resources");
		s1.blockingMethod();
		s2.blockingMethod();
		System.out.println(Thread.currentThread().getName() + "is complete");
		
	}

}
