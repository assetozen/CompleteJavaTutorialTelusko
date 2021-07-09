package com.assegd.demos.miditecbestpractices;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateTimeExercises {
	public static void main(String[] args) {

		Date date = new Date();

		LocalDate localDate = LocalDate.parse("2020-09-02");
		LocalDate beforeOneWeek = localDate.minusDays(7);

		System.out.println(date);

		System.out.println(beforeOneWeek);
		
		System.out.println("--------------------------");
		//localDateUsingUtil();
	}

	public static void localDateUsingUtil() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		String strDate = dateFormat.format(date);
		LocalDate localDate = LocalDate.parse(strDate);
		LocalDate beforeOneWeek = localDate.minusDays(7);
		System.out.println(beforeOneWeek);
	}
}
