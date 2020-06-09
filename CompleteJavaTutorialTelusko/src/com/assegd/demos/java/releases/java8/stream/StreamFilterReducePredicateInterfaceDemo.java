package com.assegd.demos.java.releases.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilterReducePredicateInterfaceDemo {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);

        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer integer) {
                return integer%5==0;
            }
        };
        System.out.println("Result of numbers which can be divided by 5 and their total using Predicate interface 025,");
        System.out.println(values.stream().filter(p).reduce(Integer::sum));
    }
}
