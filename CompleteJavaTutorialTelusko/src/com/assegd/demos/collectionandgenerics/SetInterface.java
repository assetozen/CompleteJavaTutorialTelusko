package com.assegd.demos.collectionandgenerics;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set supports only unique element
 * fetching values doesnt follow sequence
 */
public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();
        System.out.println("------------ HashSet fetches elements randomly no sequence-------------------");
        System.out.println("Checking if adding values is successful or not");
        System.out.println("adding 55-> " + values.add(55));
        System.out.println("adding 66-> " + values.add(66));
        System.out.println("adding 99-> " + values.add(99));
        System.out.println("adding 66-> " + values.add(66));

        for (int i : values){
            System.out.println(i);
        }

        Set<Integer> values1 = new TreeSet<>();
        System.out.println("\n------------ Tree Set fetches elements in sequence-------------------");
        System.out.println("Checking if adding values is successful or not");
        System.out.println("adding 55-> " + values1.add(55));
        System.out.println("adding 66-> " + values1.add(66));
        System.out.println("adding 99-> " + values1.add(99));
        System.out.println("adding 66-> " + values1.add(66));

        for (int j : values1){
            System.out.println(j);
        }
    }
}
