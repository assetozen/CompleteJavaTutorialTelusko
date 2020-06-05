package com.assegd.demos.keywords;

// When creating object of sub class it is also calling the constructor of super class

class A{
    public A() {
        System.out.println("in class A");
    }

    public  A(int i)
    {
        System.out.println("in A int");
    }

    public A(String i) {
        System.out.println("in A String ");
    }
}

class B extends A{
    public B() {
        System.out.println("in class B");
    }

    public B(int i) {
        System.out.println("in B int ");
    }

    public B(String i) {
        super(i);
        System.out.println("in B String ");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        System.out.println("Calls defalt const of class B and Super class A");
        A objA = new A(); //calls only constructor of class A
        B objB = new B(); // calls constructor of class B and its super class A


        System.out.println("\nCalls parameterized const of class B and default const of super class A");
        A objAInt = new A(5); //calls default constructor of class A
        B objBInt = new B(5); // calls parameterized constructor of class B and its default constructor of super class A


        System.out.println("\nCalls both parameterized const of class B and Super class A");
        A objAStr = new A("Assegd"); //calls parameterized constructor of class A
        B objBStr = new B("Assegd"); // calls parameterized constructor of class B and its parameterized constructor of super class A




    }
}
