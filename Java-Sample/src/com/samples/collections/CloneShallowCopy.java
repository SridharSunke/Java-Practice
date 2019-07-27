package com.samples.collections;

import com.samples.collections.CloneDeepCopy.Test;

public class CloneShallowCopy {

	class Test implements Cloneable 
	{ 
	    int x, y; 
	    
	    
	} 
	
	class Test2 implements Cloneable 
	{ 
	    int a, b; 
	  
	    Test c = new Test(); 
	    
	    public Object clone() throws CloneNotSupportedException{
	    		    	
			return super.clone();
	    	
	    	
	    }
	}
	
	
	public class Main 
	{
		public void main(String[] args) throws CloneNotSupportedException {
			
			Test2 t2= new Test2();
			t2.a=1;
			t2.b=2;
					t2.c.x=3;
					
					
		Test2 t3= (Test2)t2.clone();	
		t3.c.x=10;
		
		System.out.println(t3.c.x);
		System.out.println(t2.c.x);
				
				
		
		}
	}
}