package com.samples.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ParentChildTest {
public static void main(String[] args) {
	ParentSearlize p=new ChildSearlize();
	
	
	FileOutputStream f;
	try {
		f = new FileOutputStream(new File("D:\\SerializedObject.ser"));
	
		ObjectOutputStream os = new ObjectOutputStream(f);
		os.writeObject(p);
		
		System.out.println("object saved");
		
		os.close();
		f.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	FileInputStream f2;
	try {
		f2 = new FileInputStream(new File("D:\\SerializedObject.ser"));
	
	ObjectInputStream ois = new ObjectInputStream(f2);
	ParentSearlize s= (ParentSearlize) ois.readObject();
	s.toString();
	System.out.println(s.toString());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
