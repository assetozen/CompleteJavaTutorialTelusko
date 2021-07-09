package com.assegd.demos.miditecbestpractices;

public class TernaryIfOperatorTest {

	public static void main(String[] args) {
		boolean blStudent = false;

		String strStudent = blStudent ? "he is a student" : "he is not a student";

		System.out.println("Result" + strStudent);

		String nullName = null;
		String notNullName = "Assegd";
		String printNameifNotNull = nullName != null ? "it is not null" : "it is null";

		System.out.println("Result value is null : " + printNameifNotNull);

		printNameifNotNull = printNameifNotNull != null ? "it is not null" : "it is null";

		System.out.println("Result value is not null : " + printNameifNotNull);
	}

}
