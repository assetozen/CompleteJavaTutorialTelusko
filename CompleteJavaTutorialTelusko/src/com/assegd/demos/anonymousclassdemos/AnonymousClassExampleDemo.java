package com.assegd.demos.anonymousclassdemos;

/**
 * - lets imagine that we want to create a class which will override a single method of its super class
 * - instead of creating a new class to override its superclass method, we can simply creat object of the super class and
 * create an anonymous class(a class which doesn't have a name) for it
 * Anonymous class:- to use it only once
 *                :- its scope is only in the created places
 */

class I {
    public void show() {
        System.out.println("in I show method");
    }
}

// this class is create just to override the show method of class I
class J extends  I{
    public void show(){
        System.out.println("in J show method");
    }
}

public class AnonymousClassExampleDemo {
    public static void main(String[] args) {
        /**
         * here will create an instance of class I and override its show method using the anonymous class
         */
        I objI = new I() {
            public void show(){
                System.out.println("show method overridden using anonymous class");
            }
        };
        objI.show();// will print the anonymous class's show method
    }
}
