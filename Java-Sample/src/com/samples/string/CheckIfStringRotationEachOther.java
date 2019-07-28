package com.samples.string;

public class CheckIfStringRotationEachOther {

	public static void main(String[] args) {
		String s1="abcda";
		String s2="bcdaabcdx";
		
		if((s1+s2).contains(s1)){
			System.out.println("Sequence");
		}
	}
}
