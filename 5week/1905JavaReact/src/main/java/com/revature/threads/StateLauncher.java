package com.revature.threads;

public class StateLauncher {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread sleepy = new Thread(new SleepyThread());
		Thread waiting = new Thread(new WaitingThread(sleepy));
		
		
		System.out.println(sleepy.getState());//state should be new
		sleepy.start();
		System.out.println(sleepy.getState());//should be runnable
		
		Thread.sleep(500);//I called this to give up the proccessor to a different thread
		waiting.start();
		System.out.println(sleepy.getState());//should be timed waiting
		Thread.sleep(500);//to relinquish processor
		System.out.println(waiting.getState());//state should be waiting
		
		Thread.sleep(3000);
		System.out.println(sleepy.getState());//terminated
		

	}

}
