package com.samples.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrays {
	
	static String[] str= {"Sankar","Mouni","Hemanth"};
	static String[] str2= {"Mouni","Sankar","Hemanth"};
	

	public static void main(String[] args) {
		
		  int aLen = str.length;
	        int bLen = str2.length;
	        int[] result = new int[aLen + bLen];
	        System.arraycopy(str, 0, result, 0, aLen);
	        System.arraycopy(str2, 0, result, aLen, bLen);
	}
	}


