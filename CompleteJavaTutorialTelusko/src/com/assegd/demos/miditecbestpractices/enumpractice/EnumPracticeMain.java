package com.assegd.demos.miditecbestpractices.enumpractice;

public class EnumPracticeMain {

	public static void main(String[] args) {
		System.out.print("Access Show method from Enum:- ");
		EnumPractice.INSTANCE.show();
		System.out.println("Student 1 name :- " + EnumPractice.STUDENT_1.getName());
		System.out.println("Student 2 school:- " + EnumPractice.STUDENT_2.getSchool());

	}
}
