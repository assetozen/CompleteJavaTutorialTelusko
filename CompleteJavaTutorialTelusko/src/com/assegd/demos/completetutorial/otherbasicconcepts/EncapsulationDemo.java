package com.assegd.demos.completetutorial.otherbasicconcepts;

//Encapsulation:- finding data through methods
// main importance is to secure variables/data and maintain log file for each transaction
class Student {
    private int rollNo;
    private String name;

    public int getRollNo() {
        System.out.println("user is accessing the rollnum value");
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("roll number created or updated");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Assegd");
        s1.setRollNo(123);

        System.out.println("Name of user: "+s1.getName());
        System.out.println("Roll num of user:"+ s1.getRollNo());

    }
}
