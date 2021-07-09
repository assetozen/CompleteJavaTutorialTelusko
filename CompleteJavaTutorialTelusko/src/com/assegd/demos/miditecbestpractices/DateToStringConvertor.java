package com.assegd.demos.miditecbestpractices;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateToStringConvertor {

	public static void main(String[] args) {
		Date date = new Date(1);
		String strDate = convertDateToString(date);
		System.out.println(strDate);
		
		
		
		System.out.println("Class name: " );
		
	}
	
    public static String convertDateToString( Date date )
    {
           String strDate = "";
            DateFormat formatter2;
                formatter2 = new SimpleDateFormat( "dd.MM.yyyy" );
                if ( date != null)
                {
                    strDate = formatter2.format(date );
                }
           return strDate;
    }
}
