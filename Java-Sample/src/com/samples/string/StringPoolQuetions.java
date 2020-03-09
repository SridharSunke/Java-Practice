package com.samples.string;

public class StringPoolQuetions {
	public static void main(String[] args) {
	
		String s="Sankar";
		 String s2=s;
		 
		 s="Sridhar";
		 
		 
		 String s3=s;
		 s=s.replace("a", "e");
		String n= new String("XYZ");
		//n="ss";
		n=new String("www");
		n=n+"ss";
		System.out.println(s2);
		System.out.println(s);
		System.out.println(s3);

		System.out.println(n);
		
		

	}
	}

