package com.samples.string;

public class CountVovels {

	public static void main(String[] args) {
		String s1="abcda";
		int count=0;
		for(String c : s1.split("")){
			if(c.matches("^[aeyiuo]+$")){
				count++;
			}
		}
		System.out.println(count);
	}
}
