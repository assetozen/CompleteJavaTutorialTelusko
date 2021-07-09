package com.assegd.demos.miditecbestpractices;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CompareListOfStrings {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Joachim");
		names.add("Assegd");
		names.add("martin");
		names.add("E-mail");
		names.add("Eintritt");
		
		List<String> names2 = names;
		
		names = sortAvailableSelectionFieldNames(names);
		System.out.println("using stream.sorted");
		names.forEach(System.out::println);
		
		System.out.println("using Collections.sort");
		names = sortAvailableSelectionFieldNamesUsingCollectionsSort(names2);
		names2.forEach(System.out::println);
		
	}
	
    private static List<String> sortAvailableSelectionFieldNames( List<String> availableSelectionFieldNames )
    {
        List<String> sortedAvailableSelectionFieldNames = new ArrayList<>();

        //availableSelectionFieldNames.sort( Comparator.naturalOrder() );
        sortedAvailableSelectionFieldNames = availableSelectionFieldNames.stream().sorted().collect(Collectors.toList());

        return sortedAvailableSelectionFieldNames;
    }
    
    private static List<String> sortAvailableSelectionFieldNamesUsingCollectionsSort( List<String> availableSelectionFieldNames )
    {
    	Collator collator = Collator.getInstance();
    	 Collections.sort( availableSelectionFieldNames, collator);

        return availableSelectionFieldNames;
    }
    
   

}
