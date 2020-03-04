package com.samples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorCollectionsSample {
	
	public static void main(String[] args) {
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("Sankar", 2);
		hm.put("Mouni", 1);
		hm.put("Hemanth", 3);
		
		
		
	    List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(hm.entrySet());

		Collections.sort(entryList,  valueComparator);
		

	}
	
	  static Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {
          
          @Override
          public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
              Integer v1 = e1.getValue();
              Integer v2 = e2.getValue();
              return v1.compareTo(v2);
          }
      };
      

}
