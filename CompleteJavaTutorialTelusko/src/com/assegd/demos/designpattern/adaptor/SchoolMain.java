package com.assegd.demos.designpattern.adaptor;

public class SchoolMain {
    public static void main(String[] args) {

//        PilotPen pp = new PilotPen(); // Assuming that we have the access to class file of this class but not java file

        Pen p = new PenAdaptor();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I am a bit tired to write an assignment");
    }
}
