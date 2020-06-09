package com.assegd.demos.java.releases.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/** *********Consumer Interface **********
 *  - since it is funcational interface with only one method (called accept())
 *  - the goal is to simplify the implementing
 *  - final goal is to use lambda expression and write everything in a single line
 *
 */
//Creating a class to implement Consumer Interface
class ConsumerImpl implements Consumer<Integer> {
    public void accept(Integer i) {
        System.out.print(i + " ");
    }
}

public class ConsumerInterfaceDemo {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4, 5, 6, 7, 8, 9);

        System.out.println("\n\n1. Implementing Consumer Interface by creating class and its object");
        Consumer<Integer> obj = new ConsumerImpl();
        values.forEach(obj);

        System.out.println("\n\n2. Implementing Consumer Interface by using anonymous class and its object");
        Consumer<Integer> obj2 = new Consumer<Integer>() {
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        };
        values.forEach(obj2);


        System.out.println("\n\n3. Implementing Consumer interface's methods by using lambda expr- no need to any create class");
        values.forEach(value -> System.out.print(value + " "));
    }
}
