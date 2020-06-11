package com.assegd.demos.designpattern.adaptor;

/**
 * Assuming that we need to implement the methods of this class in School class but we only have the access of "class file" of this class
 * so we need to create another class which serves as an adaptor to access this class
 *  - PenAdaptor class created which implements Pen interface
 *  - then we can create the object of penadaptor in school class so that we can have the access of pilot pen which is created as an object
 *  in pen interface
 */
public class PilotPen {
    public void mark(String str)
    {

        System.out.println(str);
    }
}
