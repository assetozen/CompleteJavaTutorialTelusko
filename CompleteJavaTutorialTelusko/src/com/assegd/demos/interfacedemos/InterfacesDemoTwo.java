package com.assegd.demos.interfacedemos;
interface Abc{
    void show();
}

class Implementor implements Abc{
    public void show(){
        System.out.println("anything");
    }
}

public class InterfacesDemoTwo {
    public static void main(String[] args) {
        Abc obj = new Implementor();
        obj.show();
    }
}
