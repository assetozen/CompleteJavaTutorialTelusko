package com.assegd.demos.miditecbestpractices;

public class JavaSubString {

	public static void main(String[] args) {
		String str = "Jasper_FreiesFeld_14xyz";
		System.out.println("18-20: " + str.substring(18, 20));
		System.out.println("18-19: " +str.substring(18, 19));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		String str2 = "Alias_1";
		System.out.println(str2.length());
		System.out.println(str2.substring(6,7));
		
		System.out.println("\n Str3");
		String str3 = "Alias_Name_1";
		System.out.println(str3.length());
		System.out.println(str3.substring(11,12));
		
		String str4 = "ALIAS_NAME_1";
		System.out.println("str4.startsWith( \"ALIAS\" ):- "+ str4.startsWith( "ALIAS_" ));
		System.out.println("str4 - ALIAS_NAME_1 lenght: "+ str4.length());
		
		
		System.out.println("\n Str5");
		String str5 = "Alias_1";
		System.out.println(str5.length());
		System.out.println(str5.substring(6,7));
	}
}
