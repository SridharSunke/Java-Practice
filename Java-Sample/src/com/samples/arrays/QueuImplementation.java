package com.samples.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class QueuImplementation {

	int[] queue;
	int maxSize=16;
	int start=0;
	
	public void add(int i){
		queue[maxSize+1]=i;
	}
	
	public void pool(){		
		start++;
	}
	
	public int peek(int i){
		return queue[start];
	}
	
	
	
}
