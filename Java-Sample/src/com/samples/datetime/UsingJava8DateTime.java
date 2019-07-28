package com.samples.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class UsingJava8DateTime {

	public static void main(String[] args) {
		Date d1 = null;
		Date d2 = null;

		String dateStart = "01/14/2012 09:29:58";
		String dateStop = "01/15/2012 10:31:48";

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);


			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");
			
			
			//using java 8
			
			//24-May-2017, change this to your desired Start Date
			LocalDate dateBefore = LocalDate.of(2017, Month.MAY, 24);
		        //29-July-2017, change this to your desired End Date
			LocalDate dateAfter = LocalDate.of(2017, Month.JULY, 29);
			long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
			System.out.println(noOfDaysBetween);


		 } catch (Exception e) {
			e.printStackTrace();
		 }

	}
}
