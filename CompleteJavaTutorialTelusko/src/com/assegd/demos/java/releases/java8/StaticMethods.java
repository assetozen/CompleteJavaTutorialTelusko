package com.assegd.demos.java.releases.java8;

/** ************************* Static Methods
 *  - no need to create object of an interface
 *  - static methods can be simple used with ClassName.Method name in any class
 */

interface Car{
    void motor();
    static void wheel(){
        System.out.println("car wheel.....");
    }
}

class Opel implements Car{
    public void motor(){
        System.out.println("Opel car motor.....");
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        Car.wheel();
    }
}
