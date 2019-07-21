package com.sample.exceptionhandling;

public class ExceptionTest {

	public static void main(String[] args) throws CustomException {
		int i=0;
		if(i==0)
			throw new CustomException("Excption");
	}
}
