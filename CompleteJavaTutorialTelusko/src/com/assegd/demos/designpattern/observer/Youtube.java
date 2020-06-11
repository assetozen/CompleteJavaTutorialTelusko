package com.assegd.demos.designpattern.observer;

public class Youtube {
    public static void main(String[] args) {
        Channel telusko = new Channel();

        Subscriber s1 = new Subscriber("Assegd");
        Subscriber s2 = new Subscriber("Sara");
        Subscriber s3 = new Subscriber("Noah");
        Subscriber s4 = new Subscriber("Micky");
        Subscriber s5 = new Subscriber("Dave");

        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);
        telusko.subscribe(s4);
        telusko.subscribe(s5);

        telusko.unSubscribe(s3); // user has un subscriber and will not ge notification

        s1.subscribeChannel(telusko);
        s2.subscribeChannel(telusko);
        s3.subscribeChannel(telusko);
        s4.subscribeChannel(telusko);
        s5.subscribeChannel(telusko);

        telusko.upload("How to learn Programming");
    }
}
