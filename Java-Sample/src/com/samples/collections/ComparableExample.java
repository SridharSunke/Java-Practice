package com.samples.collections;

public class ComparableExample implements Comparable<ComparableExample>{

	String name;
	
	int id;
	
	@Override
	public int compareTo(ComparableExample e) {
		// TODO Auto-generated method stub
		return e.name.compareTo(this.name);
	}

}
