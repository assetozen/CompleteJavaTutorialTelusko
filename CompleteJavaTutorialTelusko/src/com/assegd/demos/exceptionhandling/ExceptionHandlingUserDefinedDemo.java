package com.assegd.demos.exceptionhandling;

public class ExceptionHandlingUserDefinedDemo {
    public static void main(String[] args) {
        int i, j;
        i = 8;
        j = 9;

        try {
            int k = i/j;
            if (k==0)
                throw  new AssegdException("This is not possible");
            System.out.println(k);
        }catch (AssegdException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
