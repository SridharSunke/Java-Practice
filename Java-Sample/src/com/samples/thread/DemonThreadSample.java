package com.samples.thread;

public class DemonThreadSample implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		DemonThreadSample t1= new DemonThreadSample();
		Thread t2= new Thread(t1);
		t2.setDaemon(true);
		t2.start();
	}

}
