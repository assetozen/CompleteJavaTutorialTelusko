package com.assegd.demos.interfacedemos;

/**
 * Types of Interfaces (this is applied till java 1.7)
 * 1. Normal:-  if you have more than method
 * 2. Single abstract method:- it will have only one method
 * 3. Marker interface: which has no method at all (Example Serializable interface)
 */

/**
 * Types of Interfaces (in java 8)
 * 1. Normal:-  if you have more than method
 * 2. Functional:- it will have only one method (we can use Lambda expression) which comes from Scala (java inherited it from Scala)
 * 3. Marker interface: which has no method at all (Example Serializable interface)
 */

//funcational interface
interface Abcde {
    void show();
}

public class InterfaceTypesDemo {
    public static void main(String[] args) {
        /** here we are tryin to implement the show method of interface Abcde, since it only has one method we don't need to create an anonymous class for it
         * instead we create lambda expression creat object of inteface
         * - this is possible only for funcational interfaces since they have only one method
         */
        Abcde obj = () -> System.out.println("I am the best:- creating instance of interface using lambda expression shortest way ");

        Abcde obj2 = new Abcde() {
            public void show() {
                System.out.println("Creating instance of interface using the longer way");
            }
        };

        obj.show();
        obj2.show();
    }
}
