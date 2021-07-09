package com.assegd.demos.miditecbestpractices;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainsMethod {
	public static void main(String[] args) {
		System.out.println("The answer for 40201 is: "+ isDynamicReportNumber(40201));
		
		System.out.println("The answer for 100 is: "+ isDynamicReportNumber(100));
		
	}


    public static boolean isDynamicReportNumber( final int nr )
    {
        boolean result;
        List<Integer> dynamicReportNumbers = new ArrayList<>();
        dynamicReportNumbers.add( 40201 );
        dynamicReportNumbers.add( 40320 );

        result = dynamicReportNumbers.contains( nr );

        return result;

    }
}
