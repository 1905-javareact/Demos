package com.revature.threads;

public class BlockingLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedResource s1 = new SynchronizedResource();
		SynchronizedResource s2 = new SynchronizedResource();
		Thread block1 = new Thread(new BlockingThread(s1, s2));
		Thread block2 = new Thread(new BlockingThread(s1, s2));
		block1.start();
		block2.start();
		
		
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(block1.getName() + " state" + block1.getState());
			System.out.println(block2.getName() + " state" + block2.getState());
		}

	}

}
