package com.samples.string;


//use recuursion
public class StringReverse {
	
	public static void main(String[] args) {

		String s="Sankar";
		String s2="";

		System.out.print(reversedString(s));

		
	}

	private static String reversedString(String s) {
		if(s.isEmpty()) {
			System.out.print(s);	
			return s;
			
		}
		return reversedString(s.substring(1))+s.charAt(0);
		 
	}
	

	
	
}
