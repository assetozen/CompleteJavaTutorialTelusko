package com.assegd.demos.designpattern.factory.phone;

public class UnknownOS implements OS{
    @Override
    public void specs() {
        System.out.println("Unknown phone operating system, please enter a correct OS name!!");
    }
}
