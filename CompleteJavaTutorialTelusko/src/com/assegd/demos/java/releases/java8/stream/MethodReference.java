package com.assegd.demos.java.releases.java8.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Internal For loop using Method Reference To simply print values");
        l.forEach(System.out::println);


        System.out.println("Internal For loop using method reference by creating my own method");
        System.out.println("Using Lambda Expression");
        l.forEach(i -> doubleIt(i));

        System.out.println("Using Method reference of my own method");
        l.forEach(MethodReference::doubleIt);
    }


    public static void doubleIt(int i){
        System.out.println(i * 2);
    }
}
