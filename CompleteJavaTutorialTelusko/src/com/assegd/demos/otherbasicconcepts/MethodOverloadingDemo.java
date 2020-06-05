package com.assegd.demos.otherbasicconcepts;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculate objAdd = new Calculate();

        objAdd.add(2,3);
        objAdd.add(2,3,4);

    }
}

class Calculate{

    public void add(int a, int b){
        System.out.println(a + b);
    }

    public void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
}
