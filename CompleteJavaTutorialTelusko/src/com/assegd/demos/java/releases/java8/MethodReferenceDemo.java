package com.assegd.demos.java.releases.java8;

import java.util.Arrays;
import java.util.List;

/** ********************* Method Reference *************************
 *  - for a method to be referenced,
 *          - if it is a static method then ClassName::MethodName
 *          if it is not static then create object of the class then
 *                          object::MethodName
 */
interface Parser {
    String parse(String str);
}

class StringParser {
    public static String convert(String s){
        if (s.length()<=3)
            s= s.toUpperCase();
        else
           s = s.toLowerCase();
        return s;
    }
}

class MyPrinter{
    public void print(String str, Parser p){
        str = p.parse(str);
        System.out.println(str);
    }
}
public class MethodReferenceDemo {
    public static void main(String[] args) {
        //lambdaAndMethodReference();

        System.out.println("\n\n Using my own implementation of Method Reference");
        String str = "Assegd Assefa Asfaw";
        MyPrinter mp = new MyPrinter();
        //mp.print(str, s -> StringParser.convert(s)); // 2nd param is object of Parser and defining the parse method
        mp.print(str, StringParser::convert); // short cut of the above line using method reference

    }


    public static void lambdaAndMethodReference(){
        List<String> names = Arrays.asList("Assegd", "Sara", "Noah", "Assefa");

        System.out.println("Normal print of names using lambda expression");
        names.forEach(name -> System.out.println(name));

        System.out.println("\nPrint names using method reference");
        names.forEach(System.out::println);

    }
}
