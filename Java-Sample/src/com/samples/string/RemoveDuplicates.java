package com.samples.string;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s1="abcda";
		String s2 = "";
		int count=0;
		for(String c : s1.split("")){
			if(s2.contains(c)){
			s1=s1.replace(c, "");
			}else{
				s2=s2+c;
			}
		}
		System.out.println(s1);
	}
}
