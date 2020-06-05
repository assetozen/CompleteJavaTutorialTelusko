package com.assegd.demos.otherbasicconcepts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * No bulcky code
 * No need to handle Exception
 * It is easy and Simple
 * It has many util methods to handle all data types
 */
public class UserInputUsingScannerDemo {
    public static void main(String[] args) throws Exception { //instead of try catch you can also use "throws  Exception"
        int n = 0;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        System.out.println(n);

    }
}
