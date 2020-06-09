package com.assegd.demos.java.releases.java8;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput; // commented when changing jdk from 1.8 to 11

import javax.crypto.spec.PSource;

/** ------------- Lambda Expression ------------------------------------
 * Example
 *      when implementing an interface with single method declaration
 *         - we can use lambda expr. to simply implement the method in a class with out creating an other class
 *         - this will not create an inner class at compile time
 */

interface  A{
    void show();
}

class Xyz implements A{
    public void show() {
        System.out.println("Hello");
    }
}

public class LambdaDemo {

    public static void main(String[] args) {
        System.out.println("Different ways of implementing show() method of an interface A");
        System.out.println("1 -- By Simply creating instance of interface A and calling show() mmethod");
        A obj = new Xyz();
        obj.show();

        System.out.println("\n2 -- If the class is creating only to implement interface's method, use anonymous class instead");
        A obj2 = new A() {
            public void show() {
                System.out.println("Using Anonymous class - Hello");
            }
        };
        obj2.show();

        System.out.println("\n3 -- simplifying step 2, removing boiler code blocks and using LAMBDA Expr");
        A obj3 = () -> {
                System.out.println("Using Lambda Expr - Hello");
        };
        obj3.show();


    }

}
