package com.assegd.demos.miditecbestpractices;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import javax.sound.midi.Soundbank;

//Link on HashMap: https://www.java67.com/2017/08/top-10-java-hashmap-interview-questions.html
//Link of the code below: https://www.java67.com/2016/05/keyset-vs-entryset-vs-values-in-java-map-example.html

public class HashMapIteratingRemovingMethods {
	public static void main(String[] args) {

		HashMap<String, Integer> priceMap = new HashMap<>();
		priceMap.put("Book", 20);
		priceMap.put("Car", 20000);
		priceMap.put("Motor", 1000);
		priceMap.put("Burger", 5);
		
		iteratingUsingKeySet(priceMap);
		
		traversingMapusingEntrySet(priceMap);
		
		collectMapValues(priceMap);
		
		removingMapElement(priceMap);
	}
	
	
	public static void iteratingUsingKeySet(HashMap<String, Integer> priceMap)
	{
		System.out.println("------------- Iterating through HashMap using keySet() --------------------");
		Set<String> keys = priceMap.keySet();
		for (String key : keys) {
			Integer value = priceMap.get(key);
			System.out.printf("key: %s, value: %d %n", key, value);
		}
	}
	
	public static void traversingMapusingEntrySet(HashMap<String, Integer> priceMap)
	{
		System.out.println("------------- Traversing Map using entrySet() -----------------------------");
		Set<Entry<String,Integer>> entries = priceMap.entrySet();
		for (Entry<String, Integer> entry : entries) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.printf("key: %s, value: %d %n", key, value);
		}
	}
	
	public static void collectMapValues(HashMap<String, Integer> priceMap) {
		
		System.out.println("------------- Collect values of a Map using values() -----------------------------");
		Collection<Integer> values = priceMap.values();
		
		System.out.println(values);
		
	}
	
	private static void removingMapElement(HashMap<String, Integer> priceMap) {
		
		System.out.println();
		System.out.println("---------------------- Removing Map Element -------------------------");
		Iterator iterator = priceMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> current = (Entry<String, Integer>) iterator.next();
			if (current.getKey().equals("Car")){
				iterator.remove();
				System.out.println("Car removed from map");
			} 
		}
		
		System.out.println("----------------- Values of the map after removing CAR are ----------------");
		iteratingUsingKeySet(priceMap);
	}
}
