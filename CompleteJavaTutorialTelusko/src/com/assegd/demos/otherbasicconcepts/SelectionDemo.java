package com.assegd.demos.otherbasicconcepts;

public class SelectionDemo {

    public static void main(String[] args) {
        ifElseStatement();
        ternaryOperator();
        switchStatement();
    }


    private  static void ifElseStatement(){
        int n = 7;
        if (n == 0) {
            System.out.println("nothing");
            System.out.println("bye");
        }else if (n % 2 == 0)
            System.out.println("it is even number");
        else
            System.out.println("it is odd number");
    }

    //short hand expression of if condition
    private static void ternaryOperator(){
        int i= 8;
        int j = 0;

        j = i>6 ? 1:2;

        System.out.println("the value of J is "+j);
    }

    private static void switchStatement(){

        int n = 1;

        switch (n){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("No Match");
        }
    }

}
