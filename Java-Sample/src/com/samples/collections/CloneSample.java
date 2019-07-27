package com.samples.collections;

import com.samples.collections.CloneShallowCopy.Test;
import com.samples.collections.CloneShallowCopy.Test2;

public class CloneSample implements Cloneable{
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Test2 t2= new CloneShallowCopy().new Test2();
		t2.a=1;
		t2.b=2;
				t2.c.x=3;
				
				
	Test2 t3= (Test2)t2.clone();	
	t3.c.x=10;
	
	System.out.println(t3.c.x);
	System.out.println(t2.c.x);
	
	
	
	

	}

}
