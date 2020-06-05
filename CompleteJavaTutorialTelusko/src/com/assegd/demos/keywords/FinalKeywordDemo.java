package com.assegd.demos.keywords;

/**
 *  Final Variables: can not be updated
 *  Final Classes : can not be extended(non inheritable)
 *  Final Methods: can not be overridden
 */

class F {
    final int DAY = 10; // can not be changed it is constant value
    final int MONTH; // can be initialized/changed only once and then it will be constant

    public F() {
        MONTH = 10;
    }
}

final class G{ } // can not be extended by subclasses
class H {
    // can not be overridden
    public final void show(){
        System.out.println("in H show method");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        F obj = new F();
        System.out.println(obj.DAY);
        System.out.println(obj.MONTH);
    }
}
