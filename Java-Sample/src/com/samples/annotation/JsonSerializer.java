package com.samples.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.samples.exceptionhandling.JsonSerializationException;

public class JsonSerializer {

	public String serialize(Object obj) throws JsonSerializationException {
	
		Class<? extends Object> c=obj.getClass();
		Map<String,String> map= new HashMap<>();
		Method[] methods=c.getDeclaredMethods();
		Field[] fields=c.getDeclaredFields();
		for(Field f:fields){
			f.setAccessible(true);
			if(f.isAnnotationPresent(JsonField.class)){
				try {
					map.put(getSerializedKey(f), (String) f.get(obj));
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					throw new JsonSerializationException("Exp");
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					throw new JsonSerializationException("Exp");
				}
				
			}
			System.out.println(toJsonString(map));
			
		}
		
		
		
		return toJsonString(map);
		
		
	}
	
	private String toJsonString(Map<String, String> map){
		String joining = map.entrySet().stream().map(entry -> "\""+entry.getKey()+":"+entry.getValue()+"\"").collect(Collectors.joining(","));
		return "{"+joining+"}";
		
	}
	public static String getSerializedKey(Field f){
		
		String val=f.getAnnotation(JsonField.class).value();
		if(val.isEmpty()){
			return f.getName();
		}	else{
			return val;
		}
		
	}
}
