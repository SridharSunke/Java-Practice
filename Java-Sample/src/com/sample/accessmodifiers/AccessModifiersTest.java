package com.sample.accessmodifiers;

public class AccessModifiersTest implements InterfaceSample,InterfaceSample2{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	
	
	public static void main(String[] args) {
		FinalSample fs= new FinalSample();
		fs.setId(10);
		
		FinalSample f2= new FinalSample();
		f2.setId(20);
		
		System.out.println(fs.equals(f2));
		
		//e cannot crate sabstract aclass if we have methods
		AbstractSample as = new AbstractSample();
		
		//AbstractSample2 as = new AbstractSample2();
		
		//we cannot create instance of interface also
		//InterfaceSample2 is= new InterfaceSample2();

	}
}
