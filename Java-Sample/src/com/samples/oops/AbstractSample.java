
package com.samples.oops;

public abstract class AbstractSample {
	
	int a=0;
	
	{
		
		a=20;
	}
	
	public abstract int add(int a,int b);
	
	 abstract int div(int a,int b);
	 
	 //cannot create private
	//private abstract int sub(int a,int b);
	 
	 
//only abstract methods should be implemented by default in reference class
	 private int mul(int a,int b) {
		 return a*b;
	 }
	
	 //constrctor possible in abstarct class
	 public AbstractSample() {}
	 
	 
	 //should be abstract if no body
	// public int plus(int a, int b);
	 
	 
	 static void ss()
	   {
	      System.out.println("Human isting");
	   }
}
