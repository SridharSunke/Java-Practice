package com.samples.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		CustomGenericsClasss<String> str= new CustomGenericsClasss<>();
		str.setT("sankar");
		
		CustomGenericsClasss type1 = new CustomGenericsClasss(); //raw type
		type1.setT("ss");
		type1.setT(22);
		
		List s=new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		type1.sum(s);
}
}