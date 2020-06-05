package com.assegd.demos.abstractdemos;
/**
 * Abstract Class:-once u make ur class abstract, no one can create object of it or instantiate it.
 *               :- you can declare a method using abstract keyword
 *               :- a sub class of an abstract class should define the declared abstract methods of an abstract class
 *               :- sub class of an abstract class is called "CONCRETE CLASS"
 */


abstract class Human{   // abstract class
    public abstract void eat();
    public void walk(){

    }
}

class Man extends Human{ // concrete class
    public void eat(){

    }
}

class Woman extends Human{ // concrete class
    public void eat(){

    }
}
public class AbstractDemo {
    public static void main(String[] args) {

        // Human obj = new Human(); //U will get error:- " 'Human' is abstract; cannot be instantiated"

        Human man = new Man();
        Human woman = new Woman();

    }
}
