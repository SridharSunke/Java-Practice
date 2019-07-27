package com.samples.collections;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	
	 public static void main(String[] args) {

	        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
	        concurrentHashMap.put("A","Apple");
	        concurrentHashMap.put("B","Blackberry");
	        for (Entry<String, String> e : concurrentHashMap.entrySet()) {
	            System.out.println(e.getKey() + " = " + e.getValue());
	        }}
}
