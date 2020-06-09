package com.assegd.demos.java.releases.java8;

/**
 * ******************** Default Method **********************************
 *      - allows methods to be defined in an interface
 *      - sub classes are not forced to implement the defined methods of an interface,
 *      their objects can simply inherit the default methods
 */
interface Phone{
    void call();

    default void message(){
        System.out.println("Phone messaging...");
    }

}

class AndroidPhone implements Phone{
    public void call(){
        System.out.println("Android calling. . . ");
    }
}


public class DefaultMethods {
    public static void main(String[] args) {
        Phone samsungPhone = new AndroidPhone();

        samsungPhone.call();
        samsungPhone.message();
    }

}
