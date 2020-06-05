package com.assegd.demos.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * TryWithResource:- lets us to use try without catch/finally blocks and processes the resource
 * and closes it by itself automatically
 */
public class TryWithResourceDemo {

    public static void main(String[] args) throws Exception { //instead of try catch you can also use "throws  Exception"
        System.out.println("Enter a number");
        int n = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { // u dont need to close the resource it will automaticallly close it after processing the resource
            n = Integer.parseInt(br.readLine()); // 45
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("The value u entered is :- "+ n);
    }
}