package com.assegd.demos.designpattern.factory;

import com.assegd.demos.designpattern.factory.phone.Android;
import com.assegd.demos.designpattern.factory.phone.OS;
import com.assegd.demos.designpattern.factory.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstanceUsingSwitch("assegd");
        obj.specs();
    }
}
