package com.assegd.demos.thread;

/**
 * The plan is to run this two classes' methods in parallel by making the classes as Threads
 * Step 1. Extend Thread for each class
 * Step 2. create a run method and put you logic there
 * Step 3. after creating objects of the classes obj.start() :- this method will call the class and automatically call the run() method
 *
 * This will run both classes methods in parallel
 */
class Hi extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

class Hello extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try{Thread.sleep(1000);}catch (Exception e){}

        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        try{Thread.sleep(10);}catch (Exception e){}
        obj2.start();
    }
}
