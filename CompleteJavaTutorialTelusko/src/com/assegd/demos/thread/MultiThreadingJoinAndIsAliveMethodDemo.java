package com.assegd.demos.thread;


public class MultiThreadingJoinAndIsAliveMethodDemo {
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
