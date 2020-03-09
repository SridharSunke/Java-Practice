package com.samples.annotation;

import com.samples.exceptionhandling.JsonSerializationException;

public class AnnotationTest {

	public static void main(String[] args) throws JsonSerializationException {
	Student s= new Student();
	System.out.print(s.clone());
	s.setId("1");
	s.setName("sankar");
	JsonSerializer serialize= new JsonSerializer();
	System.out.print(serialize.serialize(s));
	}
}
