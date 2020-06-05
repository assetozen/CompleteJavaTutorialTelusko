package com.assegd.demos.otherbasicconcepts;

import java.util.Arrays;
import java.util.List;

public class IterationDemo {

    //while, do while, for , for each
    public static void main(String[] args) {
        whileStatement();
        doWhileStatement();
        forLoopStatement();
        forEachLoopStatement();
        nestedLoopStatement();
        nestedLoopStatementTwo();
        nestedLoopStatementThree();
        nestedLoopStatementFour();
        nestedLoopStatementABC();
    }

    private static void whileStatement() {
        System.out.println("--------- While Statement --------");
        int i = 1;
        while (i <=5) {
            System.out.println( i + " Hello");
            i++;
        }
    }

    private static void doWhileStatement() {
        System.out.println("--------- Do While Statement --------");
        int i = 1;
        do{
            System.out.println(i + " Hello");
            i++;
        }
        while (i <= 5);
    }

    private static void forLoopStatement(){
        System.out.println("-------- For Loop Statement ---------");
        for (int i =1 ; i<=5; i++){
            System.out.println(i + " Hello");
        }
    }

    private static void forEachLoopStatement(){
        System.out.println("---------- For Each Loop Statement -----------------");
        List<String> names = Arrays.asList("Assegd", "Sara", "Noah", "Assefa", "Asfaw", "Moges");
        for (String name : names){
            System.out.println(name);
        }
    }



    /* display *****
               *****
               *****
     */
    private static void nestedLoopStatement(){
        System.out.println("-------- Nested Loop Statement-------------");

        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /* display *****
               ****
               ***
               **
               *
     */
    private static void nestedLoopStatementTwo(){
        System.out.println("-------- Nested Loop Statement Two-------------");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /* display
     *
     **
     ***
     ****
     *****
     */
    private static void nestedLoopStatementThree(){
        System.out.println("-------- Nested Loop Statement Three-------------");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /** display
     * * * * *
     *       *
     *       *
     * * * * *
     */
    private static void nestedLoopStatementFour(){
        System.out.println("-------- Nested Loop Statement Four-------------");

        for (int i = 1; i <=4 ;i++) {
            for (int j = 1; j <=5 ; j++) {
                if ((i==2 && j==2)|| (i==2 && j==3) || (i ==2 && j==4) || (i==3 && j==2)|| (i==3 && j==3) || (i ==3 && j==4))
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }

    private static void nestedLoopStatementABC(){

        for (int i = 65; i <= 70 ; i++) {
            for (int j = 65; j <=i ; j++) {
                System.out.print((char)j + " ");
            }
            System.out.println();
        }
    }
}
