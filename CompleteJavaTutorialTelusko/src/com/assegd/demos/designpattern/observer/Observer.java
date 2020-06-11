package com.assegd.demos.designpattern.observer;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}
