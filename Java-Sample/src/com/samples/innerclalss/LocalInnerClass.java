package com.samples.innerclalss;

public class LocalInnerClass {

	
	public void doStuff() {
		class MyInner {
			public void seeOuter() {
				System.out.println("inner " );
			}
		}
 
		MyInner i = new MyInner();
		i.seeOuter();
	}
}
