package com.assegd.demos.abstractdemos;

/**
 *Instead of creating many methods which accept different types of number values like int,double,float...
 * we are using the abstract calss "Number" which can accept any number value
 * --- w
 */


class Printer {
    public void show(Integer i) {
        System.out.println("Accepts only int and prints int:- "+i);
    }

    public void show(Double d){
        System.out.println("Accepts only Double and prints double:- "+ d);
    }

    public void show(Number n){
        System.out.println("Accepts Number class values and prints any given number value(int,double...:- )"+ n);
    }
}

public class AbstractClassDemoImplementation {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.show(5);
        obj.show(5.5);
        obj.show(5f);
        obj.show(5.5);
    }
}
