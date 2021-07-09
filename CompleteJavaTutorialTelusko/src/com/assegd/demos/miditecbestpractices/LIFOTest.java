package com.assegd.demos.miditecbestpractices;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LIFOTest {
	
	 public LIFOTest()
	    {
	        List<String> stringList = new ArrayList<String>();

	        stringList.add( "3 One flew over the cuckoo's nest" );
	        stringList.add( "2 To kill a muckingbird" );
	        stringList.add( "1 Gone with the wind" );

	        Stream<String> stream = stringList.stream();

	        Optional<String> reduced = stream.reduce( (value, combinedValue) ->
	        {
	            return combinedValue + " + " + value;
	        } );

	        System.out.println( reduced.get() );
	    }

	    public static void main( String[] args )
	    {
	        new LIFOTest();
	    }

}
