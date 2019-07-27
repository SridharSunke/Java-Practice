package com.samples.gc;

public class DifferentWaysToMakeObjectGC {
	
	String inst;
	public DifferentWaysToMakeObjectGC(String inst){
		
		this.inst=inst;
	}
	
	static void show(){
        DifferentWaysToMakeObjectGC t3 = new DifferentWaysToMakeObjectGC("t3"); 

		display();
	}
	
	private static void display() {
        DifferentWaysToMakeObjectGC t4 = new DifferentWaysToMakeObjectGC("t4"); 

	}

	public static void main(String args[]) 
    { 
        DifferentWaysToMakeObjectGC t1 = new DifferentWaysToMakeObjectGC("t1"); 
        DifferentWaysToMakeObjectGC t2 = new DifferentWaysToMakeObjectGC("t2"); 
        DifferentWaysToMakeObjectGC t5 = new DifferentWaysToMakeObjectGC("t5"); 

          
        //t1 now referred to t2 
        t1 = t2; 
        t5=null;
        new DifferentWaysToMakeObjectGC("dd");
          
        // calling garbage collector 
        System.gc(); 
    } 
	
	@Override
	protected void finalize(){
        System.out.println(this.inst + " successfully garbage collected"); 

	}

}
	