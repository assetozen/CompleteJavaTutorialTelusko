package com.assegd.demos.interfacedemos;

/**
 * There are two ways to solve ambiguity when implementing multiple interfaces with same default methods
 * 1. to create the method in your class and implement it yourself
 * 2. to access method of the interface you want to implement using super keyword
 */

interface Demos{
    void abc();
    default void show(){
        System.out.println("in Demos show ");
    }

    default void display(){
        System.out.println("in Demos display ");
    }
}

interface MyDemos{
    default void show(){
        System.out.println("in MyDemos show ");
    }

    default void display(){
        System.out.println("in MyDemos display ");
    }
}

class DemosImpl implements Demos,MyDemos{
    public void abc() {
        System.out.println("in abc");
    }

    //first solution for ambiguity of show method
    public void show() {
        System.out.println("in DemosImpl show");
    }

    //second solution for ambiguity of display method using super
    @Override
    public void display() {
        Demos.super.display(); // specifically choosing Demos display method to be implemented
    }


}

public class InterfaceMultipleInheritanceDemos {
    public static void main(String[] args) {
        DemosImpl obj = new DemosImpl();

        obj.show();
        obj.display();
    }
}
