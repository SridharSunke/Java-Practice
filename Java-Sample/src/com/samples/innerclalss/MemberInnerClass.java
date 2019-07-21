package com.samples.innerclalss;

public class MemberInnerClass {

	
	private int data=30;  
	 
	//static also possible
	protected class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
}
