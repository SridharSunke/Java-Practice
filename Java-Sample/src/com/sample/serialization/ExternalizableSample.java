package com.sample.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableSample implements Externalizable{
	@Override
	public String toString() {
		return "CustomSerializationSample [id=" + id + ", address=" + address + ", test=" + test + "]";
	}

	/**
	 * 
	 */

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



	@Override
	public void writeExternal(ObjectOutput oos) throws IOException {
		try {
			oos.writeObject(this.address);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	@Override
	public void readExternal(ObjectInput ois) throws IOException, ClassNotFoundException {

		try {
			this.address=(String) ois.readObject();
		} catch(IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	
}
