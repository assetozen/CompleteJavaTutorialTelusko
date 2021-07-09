package com.assegd.demos.miditecbestpractices;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class UtilDateHour {
	public static void main(String[] args) {
		 
		
		java.util.Date currentDateUtil = new java.util.Date(System.currentTimeMillis());
		
		
		 
		 System.out.println(currentDateUtil);
		 System.out.println(new Date().getHours());
		 
		 
		 System.out.println("******************************");
		 System.out.println("Get Yesterday from getGivenDatePlusNumberOfDays:- " + getGivenDatePlusNumberOfDays(LocalDate.now(), -1));;
		 
		 
		 
		 System.out.println("****************************");
		 Calendar calendar = Calendar.getInstance();
         calendar.add( Calendar.DATE, -1 );
         Date yesterday = convertUtilToSqlDate( calendar.getTime() );
         System.out.println("Get Yesterday from ConvertUtilToSqlDate:- "+ yesterday);
	}

	
	
    public static Date getGivenDatePlusNumberOfDays( final LocalDate localDateToday, final int iNumberOfDays )
    {
        LocalDate localDateTodayPlusNumberOfDays = localDateToday.plus( iNumberOfDays, ChronoUnit.DAYS );
        Date.from( localDateTodayPlusNumberOfDays.atStartOfDay().atZone( ZoneId.systemDefault() ).toInstant() );
        return java.sql.Date.valueOf( localDateTodayPlusNumberOfDays );
    }
    
    
    public static java.sql.Date convertUtilToSqlDate( java.util.Date dateUtil )
    {
        if ( dateUtil == null )
        {
            return null;
        }

        java.util.Calendar cal = Calendar.getInstance();

        cal.setTime( dateUtil );
        cal.set( Calendar.HOUR_OF_DAY, 0 );
        cal.set( Calendar.MINUTE, 0 );
        cal.set( Calendar.SECOND, 0 );
        cal.set( Calendar.MILLISECOND, 0 );
        java.sql.Date sqlDate = new java.sql.Date( cal.getTime().getTime() );

        return sqlDate;
    }
}
