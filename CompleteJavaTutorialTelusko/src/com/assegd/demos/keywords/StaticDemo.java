package com.assegd.demos.keywords;



public class StaticDemo {
    public static void main(String[] args) {
        Emp assegd = new Emp();
        Emp sara = new Emp();

        assegd.eId =1;
        assegd.salary = 3000;

        sara.eId = 2;
        sara.salary=4000;
        //Emp.company = "WWW AUTO Company"; // updates company for all objects of emp

        assegd.show();
        sara.show();

    }
}

class Emp{
    int eId;
    int salary;
    static String ceo = "Noah"; //will be commonly shared by all the objects of this class any change will apply to all instance values
    static String company;

    //static block will be excuted only once when the class loads
    {
        company = "ABC Software Company";
    }
public void show(){
    System.out.println(eId + " : " +salary +" : " + ceo +" : "+ company);
}
}