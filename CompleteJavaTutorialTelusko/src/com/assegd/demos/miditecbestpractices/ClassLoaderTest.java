package com.assegd.demos.miditecbestpractices;

import java.util.logging.Level;
import java.util.logging.Logger;

/* Link: https://javarevisited.blogspot.com/2012/12/how-classloader-works-in-java.html#axzz59AWpr6cb */
/**
 * Shows how the exception is thrown when an "Extension class loader" tries to read class loaded by its child class loader 
 * "Application class loader (AppClassLoader)" 
 *  
 * @author aasfaw
 *
 */
public class ClassLoaderTest {
	 
    public static void main(String args[]) {
        try {         
            //printing ClassLoader of this class
            System.out.println("ClassLoaderTest.getClass().getClassLoader() : "
                                 + ClassLoaderTest.class.getClassLoader());

            System.out.println("---------------");
            //trying to explicitly load this class again using Extension class loader
            Class.forName("test.ClassLoaderTest", true 
                            ,  ClassLoaderTest.class.getClassLoader().getParent());
            
            System.out.println("-----------------------------");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassLoaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
