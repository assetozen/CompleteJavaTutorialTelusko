package com.assegd.demos.java.releases.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfListDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Assegd", "Sara", "Noah");
        List<String> copyOfNames = List.copyOf(names);

        System.out.print("names list contains:- ");
        for (var name : names)
        {
            System.out.print(name+ " ");
        }
        System.out.print("\ncopyOfNames list contains:- ");

        for (var name : copyOfNames)
        {
            System.out.print(name+ " ");
        }

        /** -- copyOf gives unmodifiable collection and trying to modify the new collection will throw exception "UnsupportedOperationException"
         * to test that u can run this block of code
         copyOfNames.add(3,"Bekele");
        System.out.print("\ncopyOfNames modified:- ");

        for (var name : copyOfNames)
        {
            System.out.print(name+ " ");
        }
        */
    }
}
