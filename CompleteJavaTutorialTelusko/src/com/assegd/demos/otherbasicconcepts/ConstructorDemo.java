package com.assegd.demos.otherbasicconcepts;

public class ConstructorDemo {
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        Calc obj2 = new Calc(3,4);
        System.out.println("Obj2 num1= " + obj2.num1+ " and obj2 num2= "+ obj2.num2);
    }

}

class Calc{
    int num1, num2, result;
    public Calc(){
        System.out.println("Calls the default constructor");
    };
    public Calc(int num1,int num2)
    {
        System.out.println("Calls constructor with 2 int values as parameter and initializes them to the objects num1 and num2 values");
        this.num1 = num1;
        this.num2 = num2;

    }
}
