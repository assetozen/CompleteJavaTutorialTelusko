package com.assegd.demos.miditecbestpractices;

public class EvenOrOddNumber {
	public static void main(String[] args) {
		evenOrOddNumber(2);
		isOddOrEven(5);

	}

	public static void evenOrOddNumber(int num) {

		System.out.println("Result: using normal if condition");
		if (num % 2 == 0) {
			System.out.println(num + " is an even number!");

		} else {
			System.out.println(num + " is an odd number!");

		}

		System.out.println("");
		System.out.println("Result: using \" ? Operator\" if condition ");
		String number = num % 2 == 0 ? num + " is an even number!" : num + " is an odd number!";
		System.out.println(number);

	}
	
	
	/*
	 * * This method uses bitwise AND (&) operator to check if a number is * even or
	 * odd in Java
	 */ public static void isOddOrEven(int number) {
		if ((number & 1) == 0) {
			System.out.println("\nUsing bitwise operator: " + number + " is Even number");
		} else {
			System.out.println("\nUsing bitwise operator: " + number + " is Odd number");
		}
	}

}
