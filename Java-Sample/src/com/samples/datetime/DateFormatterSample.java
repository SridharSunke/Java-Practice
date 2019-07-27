package com.samples.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterSample {
//https://www.java67.com/2017/08/top-10-date-time-and-calendar-Java-Interview-Questions.html
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		String d=sdf.format(System.currentTimeMillis());
		System.out.println(d);
		
	}
}
