package com.assegd.demos.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * CHECKED EXCEPTION:- when a compiler knows the exception and prompts you to do something about it
 * UNCHECKED EXCEPTION:- when a compiler don't know the exception
 *                    :- except RuntTime Exceptions all the other exceptions are CHECKED EXCEPTIONs
 */

/**
 * In this case the main method is throwing IOException for the BufferredReader
 * Everytime you use BufferredReader you have to either handle it using try.-.catch or throws
 *                               - also since you are accessing a resource, dont' forget to close it br.close()
 */
public class CheckedExceptionDemo  {
    public static void main(String[] args) throws  Exception{ //instead of try catch you can also use "throws  Exception"
        System.out.println("Enter a number");
        BufferedReader br = null;
        int n = 0;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine()); // 45
        }catch (Exception e){
            System.out.println(e);
        }finally {
            br.close(); // always close any resource after accessing it (since .close itself is throwning exception we are putting throws to main method)
        }
            System.out.println(n);
    }
}
