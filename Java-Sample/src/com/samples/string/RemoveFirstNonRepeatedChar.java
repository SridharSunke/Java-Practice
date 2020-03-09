package com.samples.string;

import java.util.HashMap;
import java.util.Map.Entry;

public class RemoveFirstNonRepeatedChar {

	
	public static void main(String[] args) {
		String s1="abcda";

		findNonRepeatedChar(s1);
		
		
	}

	private static void findNonRepeatedChar(String s1) {
		HashMap<String,Integer> map = new HashMap<>();
		for(String c: s1.split("")) {
			 map.put(c,map.containsKey(c) ? map.get(c)+1:1);			
		}
		for(Entry<String, Integer> entry :map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.print(entry.getKey());
				break;
			}
			
		}
		
	}
	

		
		
}
