package com.assegd.demos.collectionandgenerics;

import java.util.*;


public class CollectionDemo {
    public static void main(String[] args) {
//      collectionImpl();
//      listImpl();
//        listWithGenericsImpl();
        collectionsClassImpl();
    }


    private static void collectionImpl() {
        Collection values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);

        System.out.println("Printing values of Collection");
        System.out.println(values);

        Iterator iter = values.iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
    }

    private static void listImpl() {
        System.out.println("\n\n List is used because collection doesnt have index number");
        List values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);
        values.add(2, 2); // adding 2 in index 2 after number 6

        System.out.println("Printing values of list and adding values using index number");

        System.out.println("using for loop");
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i) + " ");
        }

        System.out.println("\nUsing enhanced for loop but data type of List is Object");
        for (Object value : values) {
            System.out.print(value + " ");
        }

    }

    private static void listWithGenericsImpl() {
        System.out.println("\n\n List with generics is applied to specify the data type to be stored");
        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(6);
        values.add(9);
        values.add(2, 2); // adding 2 in index 2 after number

        System.out.println("\nPrinting values of list");
        for (Integer value : values) {
            System.out.print(value + " ");
        }
    }

    private static void collectionsClassImpl() {
        System.out.println("\n\n Collections class is implemented to apply sorting and many other util methods");
        List<Integer> values = new ArrayList<>();
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(2, 265); // adding 2 in index 2 after number

        Collections.sort(values);
        System.out.println("\nPrinting sorted values of list");
        for (Integer value : values) {
            System.out.print(value + " ");
        }

        Collections.reverse(values);
        System.out.println("\nPrinting reversed values of list");
        for (Integer value : values) {
            System.out.print(value + " ");
        }

        Collections.shuffle(values);
        System.out.println("\nPrinting shuffled values of list");
        for (Integer value : values) {
            System.out.print(value + " ");
        }

        //Comparator<Integer> comparator = ( i, j) -> i % 10 > j % 10 ? 1 : -1; // ternary operator replaces the traditional if..else and lambda exp is simplifying using FunctionalInterfaces method implementation
        Collections.sort(values, ( i, j) -> i % 10 > j % 10 ? 1 : -1);
        System.out.println("\nPrinting sorted values by their last digit sequence values of list, by creating a comparator ");
        for (
                Integer value : values) {
            System.out.print(value + " ");
        }
    }
}
