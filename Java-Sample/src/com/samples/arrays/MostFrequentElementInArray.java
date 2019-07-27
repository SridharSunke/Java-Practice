package com.samples.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MostFrequentElementInArray {

	
static String[] str2= {"Mouni","Sankar","Hemanth","Sankar"};
	

	public static void main(String[] args) {		
		Arrays.sort(str2);
		Arrays.stream(str2).forEach(System.out::print);
		//Arrays.stream(str2).filter(n->n!=null).collect(Collectors.toMap(w ->w, w->1,Integer::sum)).entrySet().stream().filter(e -> max == e.getValue())
	  //  .forEach(System.out::println);
		int maxcount=1,currentcount=1;
		String res=str2[0];
		//considering unique or sorted
		for(int i=1; i<str2.length;i++){
			if(str2[i].equals(str2[i-1])){
				currentcount++;
			}else{
					if(currentcount>maxcount){
						maxcount=currentcount;
						res=str2[i-1];
					}
					currentcount=1;
			}
			
		}
		  if (currentcount > maxcount) 
	        { 
			  maxcount = currentcount; 
	            res = str2[str2.length - 1]; 
	        } 
		  System.out.println(res);
	      
	}
}
