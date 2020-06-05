package com.assegd.demos.otherbasicconcepts;

class AddNums {  // Super, Parent, Base class
    public int add(int i, int j) {
        return i + j;
    }
}

class AddAndSubNums extends AddNums { //Sub, Child, Derived Class
    public int sub(int i, int j) {
        return i - j;
    }
}


class AddSubMulNums extends AddAndSubNums { //Sub, Child, Derived Class
    public int mul(int i, int j) {
        return i * j;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        AddAndSubNums addAndSubNums = new AddAndSubNums();
        int resultAdd = addAndSubNums.add(5, 4);
        System.out.println("Addition result:-  "+ resultAdd);
        int resultSub = addAndSubNums.sub(5, 3);
        System.out.println("Subtraction result:- "+ resultSub);

        AddSubMulNums addSubMulNums = new AddSubMulNums();
        int resultMul = addSubMulNums.mul(2,3);
        System.out.println("Multiplication result:- " + resultMul);


    }
}
