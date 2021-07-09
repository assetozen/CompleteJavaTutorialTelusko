package com.assegd.demos.miditecbestpractices;

import java.util.Arrays;
import java.util.List;

public class Java8Stream {
	public static void main(String[] args) {
		List<String> myList = Arrays.asList("  A", "B  ", "  C  ");
		boolean bl = myList.stream().anyMatch(str -> str.trim().equals("B"));
		System.out.println(bl);
	}

}
