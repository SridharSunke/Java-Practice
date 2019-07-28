package com.samples.string;

public class HighestOccurenceOfCharecter {

	public static void main(String[] args) {
	    int ASCII_SIZE = 256; 

		String s1="abcda";
        int count[] = new int[ASCII_SIZE]; 
        for (int i=0; i<s1.length(); i++) 
            count[s1.charAt(i)]++; 
        
        		int max=-1;
        		char result=' ';
        		for(int i=0;i<s1.length(); i++){
        			 if (max < count[s1.charAt(i)]) { 
        	                max = count[s1.charAt(i)]; 
        	                result = s1.charAt(i); 
        	            } 
        		}
		System.out.println(result);
	}
}
