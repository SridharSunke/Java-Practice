package com.samples.string;

public class PalindromeSample {

	public static void main(String[] args) {
		String s1="abcba";
		int count=0;
		for(int i=0,j=s1.length()-1;i<s1.length()/2;i++,j--){
			if(!(s1.charAt(i)==s1.charAt(j))){
				System.out.println("not palindrome");
			}
		}
	}
}
