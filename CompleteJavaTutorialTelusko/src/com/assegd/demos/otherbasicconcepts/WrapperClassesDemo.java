package com.assegd.demos.otherbasicconcepts;

//int,float,double,string :- are primitive datatypes
//Integer, Float, Double, String :- are Wrapper classes

/**
 * Wrapper classes are slow and are not recommended to be used but in certain situations like
 * frameworks(i.e. hibernate . . .) who only work with wrapper classes, this concept should be implemented.
 * */
public class WrapperClassesDemo {

    public static void main(String[] args) {
        int i = 5; // variable created using primitive datatype
        Integer ii = new Integer(5); // instance created using Wrapper class

        Integer ll = new Integer(i); // Boxing/Wrapping:- putting a primitive datatype in side an object
        int j = ll.intValue(); // Unboxing/Unwrapping:- taking out the value from an object

        Integer value = i; //AutoBoxing/Autowrapping:- automatically adding the value to object
        int k = value; //AutoUnboxing/Autounwrapping

        float f = 5f; // variable created using primitive datatype
        Float ff = new Float(5f); // instance created using Wrapper class


        String str = "123";
        int n = Integer.parseInt(str); // to access the int value of the string value
    }
}
