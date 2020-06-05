package com.assegd.demos.interfacedemos;

/**
 * Static methods:- to call the methods from interface u can create static methods
 * Variables in interface: if you created a variable in interfaces by default it becomes constant even if it doesnt have final keyword
 */

interface Demoss {
    int num = 8;
    void abc();
    static void show(){
        System.out.println("hi");
    }
}

class DemossImpl implements Demoss{
    public void abc() {
           // num = 9; // can not updated the variable initialized in interface
    }
}

public class InterfaceStaticMethodsDemo {
    public static void main(String[] args) {
        Demoss.show(); // called directly from interface

    }
}
