package com.sample.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	
	public static void main(String ...args){
		
		SerealizeObject s1= new SerealizeObject();
		
		s1.setAddress("T est Address");
		s1.setId(1);
		s1.name="sankar";
		s1.toString();
		
		FileOutputStream f;
		try {
			f = new FileOutputStream(new File("D:\\SerializedObject.ser"));
		
			ObjectOutputStream os = new ObjectOutputStream(f);
			os.writeObject(s1);
			
			System.out.println("object saved");
			
			os.close();
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
