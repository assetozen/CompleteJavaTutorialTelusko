package com.assegd.demos.thread;

/**
 * --------------Setting Thread name: 2 ways ----------------------
 *  1. by just simply setting the name "t1.setName("Hi Thread");
 *  2. By passing the thread name at the time of object creation
 *          Thread t1 = new Thread(Runngabla-method, "Hi Thread - name of thread");
 *-------- Setting Priority ---------------
 * 1. by just setting priority "t1.setPriority(number(1) or constants (Thread.MIN_PRIORITY) )"
 *
 *
 */

public class MultiThreadingPriorityMethodDemo {
    public static void main(String[] args) throws Exception{
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

        t1.setName("Hi Thread");
        t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();

        // to check if the thread is alive or not
        t1.isAlive(); //will give u true or fals


        // using join main wait for t1 and t2 to finish and join then we can print "Bye" at the end
        t1.join();
        t2.join();

        // to check if the thread is alive or not
        System.out.println(t1.isAlive()); // expceted false after joining the thread and it has finished its job

        System.out.println("Bye");
    }
}
