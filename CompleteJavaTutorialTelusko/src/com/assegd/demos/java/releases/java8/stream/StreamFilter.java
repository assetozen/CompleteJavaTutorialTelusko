package com.assegd.demos.java.releases.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);

        System.out.println("Add the numbers which are divisible by 5");
        System.out.println("---------- Using normal for loop ------------------");
        int result = 0;
        for (int i : values) {
            if (i%5 == 0)
                result += i;
        }
        System.out.println("Result = "+ result);


        System.out.println("---------------------- Using Stream Filter ------------------");
        System.out.println("Result using method reference Integer::sum = " + values.stream().filter(i -> i%5==0).reduce(Integer::sum).get());
        System.out.println("Result using normal lambda expression = " + values.stream().filter(i -> i%5==0).reduce(0,(c,e)-> c+e));

    }
}
