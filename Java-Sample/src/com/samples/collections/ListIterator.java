package com.samples.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

public class ListIteratorSample {
	public static void main(String args[]){  

	ArrayList<String> al=new ArrayList<String>();
	ListIterator<String> str= al.listIterator();
		str.hasNext();
		
		LinkedHashMap<Integer,String> map2=new LinkedHashMap<Integer,String>();
		Iterator<Map.Entry<Integer,String>> lit= map2.entrySet().iterator();
		str.hasNext();
	}
}
