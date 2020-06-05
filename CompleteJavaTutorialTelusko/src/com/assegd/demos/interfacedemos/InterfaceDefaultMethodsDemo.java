package com.assegd.demos.interfacedemos;

/**
 * To define methods in interface  we use "default" keyword.
 * default methods:- can be overridden in opposite to abstract methods
 * After java 1.8 there is no much difference between abstract and interfaces but always go for interfaces
 * FunctionalInterface:- you can only have one abstract methods but the rest default ones
 */

interface  Demo{
    void abc();
    public default void show(){
        System.out.println("in show");
    }
}

class DemoImpl implements  Demo{
    public void abc() {
        System.out.println("in abc");
    }

    public void show() {
        System.out.println("in new Show");
    }
}
public class InterfaceDefaultMethodsDemo {
    public static void main(String[] args) {

        Demo obj = new DemoImpl();
        obj.abc();
        obj.show();
    }
}
