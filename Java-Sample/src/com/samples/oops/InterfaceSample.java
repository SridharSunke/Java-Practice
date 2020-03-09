
package com.samples.oops;

public interface interfacesample {

	//interface cannot have constructors
	//public interfacesample() {}
	//we can create abstract methods wothout abstract keyword
	public  void add();
	abstract void sub();
default void testDefault() {
	System.out.print("default");
}
	
	static void testStatic() {System.out.print("Static");
	}
}
