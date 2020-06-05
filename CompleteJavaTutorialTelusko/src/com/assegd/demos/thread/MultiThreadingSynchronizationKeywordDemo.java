package com.assegd.demos.thread;

/**
 * synchronized keyword:- if added to a method:- only one thread is allowed to process at a time, the other thread must wait
 *
 * for this example when t1 is running t2 will wait
 */


class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}


public class MultiThreadingSynchronizationKeywordDemo {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join(); // wait main for t1 to complete its job
        t2.join(); // wait main for t1 to complete its job
        System.out.println("Count " + c.count);
    }
}
