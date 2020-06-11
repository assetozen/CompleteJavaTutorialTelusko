package com.assegd.demos.designpattern.factory.phone;

public class OperatingSystemFactory {
    public OS getInstance(String str) {
        if (str.equals("IOS"))
            return new IOS();
        else if (str.equals("Android"))
            return new Android();
        else
            return new Windows();
    }


    public OS getInstanceUsingSwitch(String str){
        switch (str) {
            case "Android":
                return new Android();
            case "IOS":
                return new IOS();
            default:
                return new Windows();
        }
    }

}
