package com.assegd.demos.thread;

/**
 * Mainly used when our class is extending an other class and since java doesnt allow multiple
 * inheritance we have to make our Thread an interface and our class can extend the class that we want
 * Runnable interface will be implemented for this case
 */

public class MultiThreadingRunnableInterfaceWithLambdaExprDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

            }
        });


        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();
    }
}
