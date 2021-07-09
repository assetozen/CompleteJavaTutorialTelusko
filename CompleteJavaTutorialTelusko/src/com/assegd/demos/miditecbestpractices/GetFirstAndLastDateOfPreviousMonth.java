package com.assegd.demos.miditecbestpractices;


import java.util.Calendar;
import java.util.Date;

public class GetFirstAndLastDateOfPreviousMonth {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		cal.set(Calendar.DATE, 1);
		Date firstDateOfPreviousMonth = cal.getTime();

		cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE)); // changed calendar to cal

		Date lastDateOfPreviousMonth =  cal.getTime();
		
		System.out.println("first date of prevoud month util: " + firstDateOfPreviousMonth);
		
		System.out.println("last date of prevoud month util: " + lastDateOfPreviousMonth);
		
		
		System.out.println("first date of prevoud month sql: " + new java.sql.Date(firstDateOfPreviousMonth.getTime()));
		
		System.out.println("last date of prevoud month sql: " + new java.sql.Date(lastDateOfPreviousMonth.getTime()));
	}
}
