package com.assegd.demos.java.releases.java8.stream;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput; // commented when changing jdk from 1.8 to 11

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class InternalAndExternalIteration {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);

        System.out.println("For loop");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        System.out.println("Using Iterator");
        Iterator<Integer> i = l.iterator();
        while (i.hasNext())
            System.out.println(i.next());


        System.out.println("Enhanced For Loop");
        for (int k : l){
            System.out.println(k);
        }

        System.out.println("Internal For loop using lambda exp");
        l.forEach(x -> System.out.println(x));


        System.out.println("Using Consumer Interface");
        //Consumer<Integer> consumer = (Integer integer) -> System.out.println(integer);
        //Consumer<Integer> consumer = integer -> System.out.println(integer);
        l.forEach(integer -> System.out.println(integer));


        System.out.println("Internal For loop using Method Reference");
        l.forEach(System.out::println);
    }
}
