package com.assegd.demos.designpattern.observer;

public class Subscriber implements Observer {
    private  String name;
    private  Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Hey "+ name + ", Video Uploaded with Title: " + channel.getTitle());
    }

    @Override
    public void subscribeChannel(Channel ch){
        channel = ch;
    }

}
