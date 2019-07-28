package com.samples.string;

public class PrintAllPermutationsOfString {

	
	public static void main(String[] args) {
		String s1="abcba";
		int count=0;
		for(int i=0;i<s1.length()-1;i++){
			for(int j=1;j<s1.length();j++){
				System.out.println(s1.substring(i, j));
			}
		}
	}
}
