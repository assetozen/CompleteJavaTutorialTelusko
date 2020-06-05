package com.assegd.demos.otherbasicconcepts;

class C {
    public void show() {
        System.out.println("in class C");
    }
}

class D extends C {
    public void show() {
        super.show(); //will also call the overridden method of super class C
        System.out.println("in class D");
    }
}

class E extends C{
    public void show(){
        System.out.println("in class E");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        D objD = new D();
        objD.show();

        System.out.println("\nobject of class D created");
        C obj1 = new D(); // this linking will be done at runtime :- is called runtime polymorphism
        obj1.show();

        System.out.println("\nobject of class E created");
        obj1 = new E();
        obj1.show(); // Dynamic method Dispatch
    }
}
