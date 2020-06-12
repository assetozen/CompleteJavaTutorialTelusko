package com.assegd.demos.completetutorial.exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {
       try {
           int i = 9/0;
       }catch (ArithmeticException e){
           System.out.println("Error "+ e.getMessage());
       }finally {
           System.out.println("Bye"); // this will be printed either u have error or not
       }


    }
}
