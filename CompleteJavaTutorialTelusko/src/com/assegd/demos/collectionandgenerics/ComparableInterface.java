package com.assegd.demos.collectionandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
    int rollNo,marks;
    String name;

    public Stud(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    public String toString() {
        return "Stud{" +
                "rollno=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Stud s) {
       //return marks>s.marks?1:-1; // cpompares based on marks
        return name.length()>s.name.length()?1:-1; // compares based on length of name
    }
}


public class ComparableInterface {
    public static void main(String[] args) {
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(23,"Assegd", 55));
        studs.add(new Stud(24,"Sara", 64));
        studs.add(new Stud(25,"Noah", 25));
        studs.add(new Stud(26,"Assefa", 36));

        /** Sorting based on the implemeted comparable method in Stud class  and compare by name length**/
        System.out.println("\nSorting based on the implemeted comparable method in Stud class  and compare by name length");
        Collections.sort(studs);
        for (Stud s : studs){
            System.out.println(s);
        }

        /** Sorting by passing the comparable object logic inside the sort method by overriding the comparable method in Stud class  and compare by marks**/
        System.out.println("\nSorting by passing the comparable object logic inside the sort method by overriding the comparable method in Stud class and compare by marks");
        Collections.sort(studs, (i,j) -> i.marks>j.marks?1:-1);
        for (Stud s : studs){
            System.out.println(s);
        }

    }
}
