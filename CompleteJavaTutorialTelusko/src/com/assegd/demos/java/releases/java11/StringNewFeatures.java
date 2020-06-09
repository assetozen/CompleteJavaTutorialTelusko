package com.assegd.demos.java.releases.java11;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class StringNewFeatures {
    public static void main(String[] args) {
        var myName = "    Assegd!!     !";

        System.out.println("Repeat my name:- "+ myName.repeat(3));
        System.out.println("Check if it is blacnk:- " + myName.isBlank());
        System.out.println("Remove all the white spaces:- "+ myName.strip()); //str.trim():-  equivalent
        System.out.println("Remove the leading spaces before myName:- " + myName.stripLeading());
    }
}
