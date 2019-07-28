package com.samples.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.samples.oops.MethodOverLoading;

public class ReflectionSample {

	
	public static void main(String[] args) {
		Method[] methods =MethodOverLoading.class.getMethods();

		for(Method method : methods){
			method.setAccessible(true);
		    System.out.println("method = " + method.getName());
		}
		
		Field[] fields   = MethodOverLoading.class.getFields();
	
	}
}
