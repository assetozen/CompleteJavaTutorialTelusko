package com.assegd.demos.designpattern.adaptor;

public class SchoolMain {
    public static void main(String[] args) {
//        PilotPen pp = new PilotPen();
        Pen p = new PenAdaptor();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I am a bit tired to write an assignment");
    }
}
