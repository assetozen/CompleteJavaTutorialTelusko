package com.assegd.demos.java.releases.java12;


import org.apache.commons.lang3.StringUtils;

public class StringFeatures {
    public static void main(String[] args) {
        String myName = "assegd Assefa Asfaw";
        System.out.println("Indent 50 character spaces before printing my name");
//        System.out.println(myName.indent(50)); // this is not workiing but in terminal jshell it is working

        System.out.println("\n Abbreviate max 10 Chars and Capitalize my name 'assegd Assefa Asfaw'");
        System.out.println(StringUtils.abbreviate(StringUtils.capitalize(myName), 10));
        System.out.println("\nCapitalize all the letters");
        System.out.println(StringUtils.toRootUpperCase(myName));


    }
}
