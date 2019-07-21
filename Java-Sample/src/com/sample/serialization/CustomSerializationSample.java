package com.sample.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//we can own serialization ,even transient can be sent/retrieved
public class CustomSerializationSample implements Serializable{
	
	@Override
	public String toString() {
		return "CustomSerializationSample [id=" + id + ", address=" + address + ", test=" + test + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4613080301798198904L;

	public int id;
	
	static String name;
	
	transient String address;
	
	private String test;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		CustomSerializationSample.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	//private so that other methods cant inherit and jvm only reads
	private void writeObject(ObjectOutputStream oos){
		try {
			oos.defaultWriteObject();
			oos.writeObject(this.address);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void readObject(ObjectInputStream ois){
		
		try {
			ois.defaultReadObject();
			this.address=(String) ois.readObject();
		} catch(IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
