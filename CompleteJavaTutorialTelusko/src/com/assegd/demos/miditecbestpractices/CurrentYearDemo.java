package com.assegd.demos.miditecbestpractices;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class CurrentYearDemo {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);

		Date currentDate = Date.valueOf(LocalDate.now());

		System.out.println("Current date using sql date: " + currentDate);

		Date currentDate2 = Date.valueOf(LocalDate.now());
		System.out.println("Current Date format using toString() : " + currentDate2);

	}

	private Date getDateTodayPlusNumberOfDays(final LocalDate localDateToday, final int iNumberOfDays) {
		LocalDate localDateTodayPlusNumberOfDays = localDateToday.plus(iNumberOfDays, ChronoUnit.DAYS);
		Date.from(localDateTodayPlusNumberOfDays.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		return java.sql.Date.valueOf(localDateTodayPlusNumberOfDays);
	}

}
