package com.assegd.demos.completetutorial.otherbasicconcepts;

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
        System.out.println("Total value of 8 params added as numbers is:- " + total);



        int total2 = obj.add(1,2,3,4);
        System.out.println("Total value of 4 params added as numbers is:- " + total2);


        int total3 = obj.add(1);
        System.out.println("Total value of 1 param added as number is:- " + total3);
    }
}
