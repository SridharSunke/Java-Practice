package com.sample.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerilAndeExtTest {
	public static void main(String[] args){
	CustomSerializationSample s1= new CustomSerializationSample();
	s1.setAddress("sss");
	s1.setId(12);
	s1.setName("aaa");
	
	ExternalizableSample s2=new ExternalizableSample();
	
	s2.setAddress("sss");
	s2.setId(12);
	s2.setName("aaa");
	
	
	try {
		FileOutputStream f = new FileOutputStream(new File("D:\\SerializedObject.ser"));
	
		ObjectOutputStream os = new ObjectOutputStream(f);
		os.writeObject(s1);
		
		System.out.println("object saved");
		
		os.close();
		f.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	FileInputStream f;
	try {
		f = new FileInputStream(new File("D:\\SerializedObject.ser"));
	
	ObjectInputStream ois = new ObjectInputStream(f);
	CustomSerializationSample s= (CustomSerializationSample) ois.readObject();
	s.toString();
	System.out.println(s.toString());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		FileOutputStream f2 = new FileOutputStream(new File("D:\\SerializedObject.ser"));
	
		ObjectOutputStream os = new ObjectOutputStream(f2);
		os.writeObject(s2);
		
		System.out.println("object saved");
		
		os.close();
		f2.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	FileInputStream fo;
	try {
		fo = new FileInputStream(new File("D:\\SerializedObject.ser"));
	
	ObjectInputStream ois = new ObjectInputStream(fo);
	ExternalizableSample s= (ExternalizableSample) ois.readObject();
	s.toString();
	System.out.println(s.toString());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	

}}
