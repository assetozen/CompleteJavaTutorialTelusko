package com.assegd.demos.otherbasicconcepts;

class Outer {
    int a;
    int b;

    public void show() {
        System.out.println("in shou method");
    }

    class Inner {
        public void display() {
            System.out.println("in display method");
        }
    }

    static class StaticInnerClass{
        public void display(){
            System.out.println("in static inner class display method");
        }
    }
}

public class InnerOuterClassDemo {
    public static void main(String[] args) {

        Outer outerObj = new Outer();
        outerObj.show();

        Outer.Inner innerObject = outerObj.new Inner();
        innerObject.display();

        //accessing static inner class
        Outer.StaticInnerClass staticInnerObject = new Outer.StaticInnerClass();
        staticInnerObject.display();

    }
}

