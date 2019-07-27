package com.samples.arrays;

import java.util.Arrays;

public class CheckArrayEqual {

	static String[] str= {"Sankar","Mouni","Hemanth"};
	static String[] str2= {"Mouni","Sankar","Hemanth"};
	

	public static void main(String[] args) {
		System.out.println(Arrays.equals(str, str2));
		System.out.println(Arrays.stream(str).equals(str2));
		Arrays.sort(str);
		Arrays.sort(str2);
		System.out.println(Arrays.equals(str, str2));
		
		//considering unique or sorted
		for(int i=0; i<str.length;i++){
			if(str[i]!=str2[i]){
				System.out.println("NotEqual");
			}
			
		}
		
		
		//using streams
		System.out.println(Arrays.stream(str).equals(str2));
		
		Arrays.stream(str).filter(s -> s.contains("S")).forEach(System.out::println);
		
	}
}
