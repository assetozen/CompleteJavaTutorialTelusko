package com.assegd.demos.otherbasicconcepts;

class AddNumbers {
    public int add(int... n) {
        int sum = 0;
        for (int num : n) {
            sum = sum + num;
        }
        return sum;
    }
}

public class VariableArgumentsDemo {
    public static void main(String[] args) {
        AddNumbers obj = new AddNumbers();
        int total = obj.add(1,2,3,4,5,6,7,8);
        System.out.println("Total value of numbers is:- " + total);
    }
}
