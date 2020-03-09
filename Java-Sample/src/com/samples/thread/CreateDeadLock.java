
package com.samples.thread;

public class CreateDeadLock {
	
	static String s="ss";
	static String s2="zz";
	
	public static void main(String[] args) {
		
		Thread t1=new Thread(new MyRunnableDeadLock());
		Thread t2=new Thread(new MyRunnableDeadLock2());
t1.start();
t2.start();
		
	}
	public static class MyRunnableDeadLock implements Runnable{

		@Override
		public void run() {
			synchronized (s){
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (s2){}
				
			}
			
		}}
	
	public static class MyRunnableDeadLock2 implements Runnable{

		@Override
		public void run() {
			synchronized (s2){
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (s){}
				
			}
			
		}}

}
