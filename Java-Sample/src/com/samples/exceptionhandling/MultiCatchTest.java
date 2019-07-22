package com.samples.exceptionhandling;

public class MultiCatchTest {

	
	public static void main(String[] args) {
		int i=0;
		 try {
		 if(i==0){
			 throw new CustomException("Custom");
			 
		 }
		 i=2;
		 
		 if(i==4){
			 throw new IndexOutOfBoundsException();
		 }
		 
		 }catch ( CustomException |IndexOutOfBoundsException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		 }
	
	
}
