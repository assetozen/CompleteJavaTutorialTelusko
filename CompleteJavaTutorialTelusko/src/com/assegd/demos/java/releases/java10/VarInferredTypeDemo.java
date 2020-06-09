package com.assegd.demos.java.releases.java10;

import java.util.Arrays;
import java.util.List;

/**
 * Highly recommended to use it only in local variables
 * - if needed to implement it anywhere in the code, then the developers-team should agree where to implement it
 * for code consistency
 */
public class VarInferredTypeDemo {
    public static void main(String[] args) {
        String name = "Assegd";
        var lastName = "Asfaw";

        System.out.println("var can be local variable:- "+ name +" "+ lastName);

        List<String> names = Arrays.asList(name, lastName);

        System.out.println("var value can be accessed from a list and also in for loops variable assignment");
        for(var nameList : names){
            System.out.println(nameList);
        }

    }

}
/** --------------- Illegal use of Var -------------------------
 * As mentioned earlier, var won't work without the initializer:
 *              var n; // error: cannot use 'var' on variable without initializer
 * Nor would it work if initialized with null:
 *              var emptyList = null; // error: variable initializer is 'null'
 * It won't work for non-local variables:
 *              public var = "hello"; // error: 'var' is not allowed here
 * Lambda expression needs explicit target type, and hence var cannot be used:
 *              var p = (String s) -> s.length() > 10; // error: lambda expression needs an explicit target-type
 * Same is the case with the array initializer:
 *              var arr = { 1, 2, 3 }; // error: array initializer needs an explicit target-type
 * */
