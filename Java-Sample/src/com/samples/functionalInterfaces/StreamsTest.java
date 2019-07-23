package com.samples.functionalInterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {
	public static void main(String[] args) {
		
		StreamsTestMultiBean st =new StreamsTestMultiBean();
		StreamsTestMultiBean st2 =new StreamsTestMultiBean();
		StreamsTestMultiBean st3 =new StreamsTestMultiBean();

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
		
		st3.setAddress("CHN");
		st3.setId(3);
		st3.setSubject(subList);
		st3.setName("Hemath");
		
		
		
		List<StreamsTestMultiBean> list= new ArrayList<StreamsTestMultiBean>();
		
		list.add(st);
		list.add(st2);
		list.add(st3);

		
		
		
		HashMap<Integer,StreamsTestMultiBean> map= new HashMap<>();
		
		map.put(1,st);
		map.put(2, st2);
		
		
		HashSet<StreamsTestMultiBean> set= new HashSet<>();
		
		set.add(st);
		set.add(st2);

		
		TreeMap<Integer,StreamsTestMultiBean> treeMap= new TreeMap<>();
		treeMap.put(1,st);
		treeMap.put(2, st2);
		

		//for each
		Stream.of(1,2,3,4,5,6,7,8,9,11,1,2,11).distinct().forEach(System.out::println);;
	   
		//using startswith & allmatch
	    Boolean match=list.stream().allMatch((s9) -> s9.getName().startsWith("S"));
	    
	    System.out.println(match);
	    
	    //list to amp
	   HashMap<Integer,String > hasmap=(HashMap<Integer, String>) list.stream().collect(Collectors.toMap(x -> x.getId(), y -> y.getName()));
	    
	   //getting values from maap
	   System.out.println(hasmap.entrySet().stream().findFirst().get().getKey());
	   
	   
	   //filter
	   list.stream().filter(i -> i.getName().equals("Sankar")).unordered().forEach(System.out::println);
	   
	   //reduce sample
	  Stream<Integer> ss=Stream.of(1,2,3,4,5,6,7,8,9,11,1,2,11);
	    int sum=ss.reduce(0,(i,j) -> i+j);
	    System.out.println(sum);
	    
	    
	    //flatmap
	   //// List<Subject> sss=map.entrySet().stream().flatMap(k ->k.getValue().getSubject().stream()).filter(i -> {i.getSubjectName("Hindi");}).collect(Collectors.toList()));
	    
	    List<Subject> sss=list.stream().filter(name ->name.id>1).flatMap(x -> x.subject.stream()).filter(sub -> sub.getSubjectName().contains("Hindi")).collect(Collectors.toList());
	    System.out.println(sss.size());
	    
	    
	    
	    //map
	    list.stream().filter(f -> f.id>1).map(z-> z.name.toUpperCase()).forEach(n -> System.out.println(n));
	}
	
}
