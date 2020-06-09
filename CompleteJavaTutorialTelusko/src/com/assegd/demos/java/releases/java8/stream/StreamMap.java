package com.assegd.demos.java.releases.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        int result = 0;

        System.out.println("\nMultiply every element and print");
        System.out.println(values.stream().map(i -> i*2).collect(Collectors.toList()));

        System.out.print("\n[1,2,3,4,5,6] Multiply each element and add them all:- ");
        System.out.print(values.stream().map(i -> i*2).reduce(0, (c,e)-> c+e));

        System.out.print("\n[1,2,3,4,5,6] Multiply each element and add them all using Integer.sum built in mehthod:- ");
        System.out.print(values.stream().map(i -> i*2).reduce(0, (c,e)-> Integer.sum(c,e)));

        System.out.print("\n[1,2,3,4,5,6] Multiply each element and add them all using Integer::sum built in mehthod Reference:- ");
        System.out.print(values.stream().map(i -> i*2).reduce(0, Integer::sum));

    }
}
