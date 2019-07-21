package com.samples.innerclalss;

import com.samples.innerclalss.MemberInnerClass.Inner;
import com.samples.innerclalss.StaticInnerClass.StaticInner;

public class InnerClassTest implements NestedInterface.InnerInterface{
	
	 public void msg(){System.out.println("Hello nested interface");}  

	public static void main(String[] args) {
		
		MemberInnerClass mic=new MemberInnerClass();
		Inner i=mic.new Inner();
		i.msg();

		
		StaticInnerClass.StaticInner s= new StaticInnerClass.StaticInner();
		s.go();
		
		NestedInterface.InnerInterface nest=new InnerClassTest();
		nest.msg();

		}

}
