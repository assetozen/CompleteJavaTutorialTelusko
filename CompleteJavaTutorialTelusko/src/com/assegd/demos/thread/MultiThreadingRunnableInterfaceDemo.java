package com.assegd.demos.thread;

/**
 * Mainly used when our class is extending an other class and since java doesnt allow multiple
 * inheritance we have to make our Thread an interface and our class can extend the class that we want
 * Runnable interface will be implemented for this case
 */

class Hii implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

class Helloo implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try{Thread.sleep(1000);}catch (Exception e){}

        }
    }
}


public class MultiThreadingRunnableInterfaceDemo {

    public static void main(String[] args) {
        Runnable obj1 = new Hii();
        Runnable obj2 = new Helloo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);


        t1.start();
        try{Thread.sleep(10);}catch (Exception e){}
        t2.start();
    }
}
