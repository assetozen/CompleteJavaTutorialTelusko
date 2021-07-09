package com.assegd.demos.miditecbestpractices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListVsHashSet {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		Set<String> hashSet = new HashSet<>();

		arrayList.add("Assegd");
		arrayList.add("Sara");
		arrayList.add("Noah");

		hashSet.add("Assegd");
		hashSet.add("Sara");
		hashSet.add("Noah");

		System.out.println("HashSet values printed via foreach");
		for (String string : hashSet) {
			System.out.println(string);
		}
		System.out.println("Get Assegd with iterator next element: " + hashSet.iterator().next());
		hashSet.contains("Assegd");

		System.out.println("\n------------------------------------------------------------");
		System.out.println("Arraylist values printed via foreach");
		for (String string : arrayList) {
			System.out.println(string);
		}

		System.out.println("Get Assegd with index: " + arrayList.get(0));
	}

}
