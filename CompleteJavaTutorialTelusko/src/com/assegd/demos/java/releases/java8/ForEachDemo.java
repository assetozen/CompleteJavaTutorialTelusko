package com.assegd.demos.java.releases.java8;

import java.util.Arrays;
import java.util.List;

/** *********************** ForEach *****************
 *  - it is internal loop which is already included in collections
 *  - it is much faster than external for loops(i.e for loop, enhanced for loop)
 *  - it uses lambda expresion
 */

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4,5,6,7,8);

        System.out.println("Traditional for loop - External loop");
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i) + " ");
        }

        System.out.println("\n\nEnhanced For loop - External loop");
        for (int i : values){
            System.out.print(i + " ");
        }

        System.out.println("\n \nForEach - Internal loop introduced in java 8");
        values.forEach(value ->System.out.print(value + " ")); // implementation of Consumer Interface
    }
}
