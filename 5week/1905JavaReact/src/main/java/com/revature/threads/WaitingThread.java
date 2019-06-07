package com.revature.threads;

public class WaitingThread implements Runnable{

	private Thread waitingOn;
	
	public WaitingThread(Thread t) {
		this.waitingOn = t;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		try {
			waitingOn.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
