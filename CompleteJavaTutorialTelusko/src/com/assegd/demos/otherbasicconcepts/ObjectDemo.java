package com.assegd.demos.otherbasicconcepts;

//Creating an object and accessing the member variables and methods
public class ObjectDemo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.num1 = 3;
        obj.num2 = 3;
        obj.perform();
        System.out.println(obj.result);
    }

}

class Calculator {
    int num1, num2, result;

    public void perform() {
        result = num1 + num2;
    }
}
