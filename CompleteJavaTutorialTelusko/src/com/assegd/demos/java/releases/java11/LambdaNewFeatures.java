package com.assegd.demos.java.releases.java11;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class LambdaNewFeatures {
    public static void main(String[] args) {
        System.out.println("Prevously");
        Consumer<BigDecimal> moneyConsumer = (money) -> System.out.println("I have go this much money:- "+ money);

        System.out.println("Now with java 11, we can add var inferred type which will also allow us to use annotations");
        Consumer<BigDecimal> moneyConsumer1 = (@Deprecated var money1) -> System.out.println("I have go this much money:- "+ money1);


    }
}
