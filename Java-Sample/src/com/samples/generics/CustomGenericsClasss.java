package com.samples.generics;

import java.util.List;

public class CustomGenericsClasss<T> {

	
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public Boolean isequal(CustomGenericsClasss<T> obj1,CustomGenericsClasss<T> obj2)
	{
		return obj1.getT().equals(obj2.getT());
		
	}
	
	public double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		System.out.println(sum);
		return sum;
		
	}
	
	public  void addIntegers(List<? super Integer> list){
		list.add(new Integer(50));
	}
}
