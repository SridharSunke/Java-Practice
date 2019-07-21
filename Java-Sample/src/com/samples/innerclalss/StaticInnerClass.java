package com.samples.innerclalss;

public class StaticInnerClass {

	static class StaticInner {
		void go() {
			System.out.println("Inner class reference is: " + this);
		}
}
}