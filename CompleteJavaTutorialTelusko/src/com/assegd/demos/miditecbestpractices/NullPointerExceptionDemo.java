package com.assegd.demos.miditecbestpractices;


//LINK: https://www.educative.io/edpresso/how-to-resolve-the-javalangnullpointerexception

public class NullPointerExceptionDemo {
	public static void main(String[] args) {
		String s = "abcd";
		
		foo(s);
		foo(null);
		bar(null);
		
	}
	
	//using try-catch block
	static void foo(String x) {
		try {

			System.out.println("First Character: "+ x.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException thrown(using try-catch)!!");
		}
	}
	
	//using if-else block
	static void bar(String x) {
		if (x != null) {
			System.out.println("First character: "+ x.charAt(0));
		}else {
			System.out.println("NullPointerException thrown(using if-else)!!");
		}
	}
	
	

}
