package com.samples.string;

public class RemoveGivenCharecter {
	public static void main(String[] args) {
		String s1="abcda";
		String s2="a";
		s1.replace(s2, "");
		System.out.println(s1);
	}
}
