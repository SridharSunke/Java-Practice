package com.samples.functionalInterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Stream;

public class StreamsTest {
	public static void main(String[] args) {
		
		StreamsTestMultiBean st =new StreamsTestMultiBean();
		StreamsTestMultiBean st2 =new StreamsTestMultiBean();

		Subject s= new Subject();
		s.setSubjectName("Hindi");
		

		Subject s2= new Subject();
		s2.setSubjectName("English");
		
		List<Subject> subList = new ArrayList<>();
		
		st.setAddress("HYD");
		st.setId(1);
		st.setSubject(subList);
		st.setName("Sankar");
		

		st2.setAddress("BLR");
		st2.setId(2);
		st2.setSubject(subList);
		st2.setName("Mouni");
		
		
		List<StreamsTestMultiBean> list= new ArrayList<StreamsTestMultiBean>();
		
		list.add(st);
		list.add(st2);
		
		
		HashMap<Integer,StreamsTestMultiBean> map= new HashMap<>();
		
		map.put(1,st);
		map.put(2, st2);
		
		
		HashSet<StreamsTestMultiBean> set= new HashSet<>();
		
		set.add(st);
		set.add(st2);

		
		TreeMap<Integer,StreamsTestMultiBean> treeMap= new TreeMap<>();
		treeMap.put(1,st);
		treeMap.put(2, st2);
		


		Stream.of(1,2,3,4,5,6,7,8,9,11,1,2,11).distinct().forEach(System.out::println);;
	   
	    Boolean match=list.stream().allMatch((s9) -> s9.getName().startsWith("S"));
	    
	    System.out.println(match);
	    
	    
	   

	}
	
}
