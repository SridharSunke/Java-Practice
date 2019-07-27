package com.samples.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.samples.annotation.JsonSerializer;
import com.samples.annotation.Student;
import com.samples.exceptionhandling.JsonSerializationException;


public class JsonSerializeTest {
	//@Ignore
	@Test//(expected=JsonSerializationException.class)
	public void testJsonSerailze() throws JsonSerializationException{
		Student s= new Student();
		s.setId("1");
		s.setName("sankar");
		JsonSerializer serialize= new JsonSerializer();
		assertEquals(serialize.serialize(s),"{\"\name:sankar\",\"id:1\"}");
		
		
	}
	
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testJsonSerailzeException() {
		Student s= new Student();
		s.setId("1");
		s.setName("sankar");
		JsonSerializer serialize= new JsonSerializer();
		try {
			serialize.serialize(s);
		} catch (JsonSerializationException e) {
			// TODO Auto-generated catch block
			thrown.expect(JsonSerializationException.class);
			thrown.expectMessage("Exp");
		}
		
	}

}
