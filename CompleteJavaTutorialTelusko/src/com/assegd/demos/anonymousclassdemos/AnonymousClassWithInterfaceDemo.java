package com.assegd.demos.anonymousclassdemos;

interface Abcd {
    void show();
}

// the purpose of this class is just to implement the show method
class ImplementorClass implements Abcd {
    public void show() {
        System.out.println("anything");
    }
}

public class AnonymousClassWithInterfaceDemo {
    /**
     * here will create an instance of interface Abcd and implement its show method using the anonymous class
     * - will be used only in this particular class, u can not reuse it
     */
    public static void main(String[] args) {
        Abcd obj = new Abcd() {
            public void show() {
                System.out.println("anything using anonymous class to instantiate the interface");
            }
        };
        obj.show();
    }
}
