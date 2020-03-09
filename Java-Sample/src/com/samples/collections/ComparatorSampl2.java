package com.samples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ComparatorSampl2 {

	public static void main(String[] args) {
		String s1="abcda";

		highestOccurance(s1);
		
		
	}

	private static void highestOccurance(String s1) {
		HashMap<String,Integer> map = new HashMap<>();
		for(String c: s1.split("")) {
			 map.put(c,map.containsKey(c) ? map.get(c)+1:1);			
		}

        List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(map.entrySet());

        
        //collections.reverseorder to reverse a comparator
		Collections.sort(listOfEntries,Collections.reverseOrder(new Comparator<Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				Integer v1 = o1.getValue();
                Integer v2 = o2.getValue();
                return v1.compareTo(v2);			
			}}));
		
		for(Entry<String, Integer> entry :listOfEntries) {
			if(entry.getValue() != null) {
				System.out.print(entry.getKey());
				break;
			}
			
		}
	}
}
