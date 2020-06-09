package com.assegd.demos.java.releases.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FindFirstOrElse {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);

        System.out.println(values.stream()
                                    .filter(i -> i%5==0) //is lazy function
                                    .map(i -> i *2)// is lazy function
                                    .findFirst() // is Terminal Function // returns optional [number], if empty then Optional.empty
                                    .orElse(0)); //but if u don't want to return back optional instead other number then use orElse it will return for this example 0
    }
}
