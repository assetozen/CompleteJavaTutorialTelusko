package com.assegd.demos.miditecbestpractices;

import org.apache.commons.lang3.tuple.ImmutablePair;



public class ImmutablePairsAndTheirSorting {
	public static void main(String[] args) {
		
		ImmutablePair<Integer, String> pair = new ImmutablePair<>(2, "Two");
		Integer key = pair.getKey();
		String value = pair.getValue();
		
		System.out.println("Pair key: " + key);
		System.out.println("Pair value: " + value);
	
	}
	
	

}
