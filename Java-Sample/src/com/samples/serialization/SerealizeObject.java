package com.samples.serialization;

import java.io.Serializable;

public class SerealizeObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5730165452610280039L;

	public int id;
	
	static String name;
	
	transient String address;
	
	private String test;


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	public String toString(){
		return address+"   "+id+"	"+name+"  "+test;
		
		
	}
	
}
