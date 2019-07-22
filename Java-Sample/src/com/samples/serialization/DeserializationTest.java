package com.samples.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializationTest {

	public static void main(String ...args){
		
		FileInputStream f;
		try {
			f = new FileInputStream(new File("D:\\SerializedObject.ser"));
		
		ObjectInputStream ois = new ObjectInputStream(f);
		SerealizeObject s= (SerealizeObject) ois.readObject();
		s.toString();
		System.out.println(s.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
