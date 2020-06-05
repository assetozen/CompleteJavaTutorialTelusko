package com.assegd.demos.otherbasicconcepts;

public class BreakContinueJumpingStatement {
    // Break, Continue
    public static void main(String[] args) {
        continueStatement();
        System.out.println();
        breakStatement();
    }

    private static void continueStatement() {
        System.out.println("--- Continue Statement--");
        System.out.println("-- will skip printing 7 continues printing the rest of numbers  --");
        for (int i = 1; i <= 10; i++) {
            if (i == 7)
                continue; // will skip printing 7 continues printing the rest of numbers
            System.out.print(i + " ");
        }
    }

    private static void breakStatement() {
        System.out.println("---------Break Statement-------------");
        System.out.println("will stop execution of this function when the num reaches 7");
        for (int i = 1; i <= 10; i++) {
            if (i == 7)
                break; // will stop execution of this function
            System.out.print(i + " ");
        }
    }


}
