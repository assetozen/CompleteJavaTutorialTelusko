package com.assegd.demos.otherbasicconcepts;

public class ArrayDemo {
    public static void main(String[] args) {
        showArrayValues();//1D
        showArrayValuesUsingEnhancedForLoop();
        arrayOfObjects();//1D
        twoDimensionalArray();//2D
        twoDimensionalJaggedArray();
        twoDimensionalArrayUsingEnhancedLoop();

    }

    public static void showArrayValuesUsingEnhancedForLoop() {

        System.out.println("Display values of an array using enhanced for loop");
        int values[] = {1,2,3,4};

       for(int value :values){
           System.out.println(value);
       }
    }


    public static void showArrayValues() {
        int nums[] = new int[4];
        int values[] = {1,2,3,4}; // you can also specify the values if u know them prehand
        nums[0] = 23;
        nums[1] = 33;
        nums[2] = 44;
        nums[3] = 55;
        //you can updated each element
        nums[2] = 99;

        for (int i = 0; i < 4; i++) {
            System.out.println(nums[i]);
        }

        for (int i = 0; i <values.length ; i++) {
            System.out.println(values[i]);
        }
    }

    public static void arrayOfObjects(){

        System.out.println("Display Array of Students' name ");
        Student s1 = new Student("1","Sara","Female");
        Student s2 = new Student("2","Hana","Female");
        Student s3 = new Student("3","Kebede","Male");
        Student s4 = new Student("4","Abebe","Male");

        Student[] students = new Student[4];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        for (int i = 0; i < students.length; i++) {
            System.out.println((students[i].name));
        }
    }

    public static void twoDimensionalArray(){
        System.out.println("Display 2D Array");
        int[]a = {1,2,3,4};
        int[]b = {5,6,7,8};
        int[]c = {9,0,1,2};

        int[][] d = {a,b,c};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(" " + d[i][j]);
            }
            System.out.println();
        }
    }


    public static void twoDimensionalJaggedArray(){
        System.out.println("Display 2D Jagged Array");
        int[]a = {1,2,3,4};
        int[]b = {5,7,8};
        int[]c = {9,0,1,2};

        int[][] d = {a,b,c};

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j <d[i].length ; j++) {
                System.out.print(" " + d[i][j]);
            }
            System.out.println();
        }
    }

    public static void twoDimensionalArrayUsingEnhancedLoop(){
        System.out.println("Display 2D Array Using Enhanced Loop");
        int[]a = {1,2,3,4};
        int[]b = {5,6,7,8};
        int[]c = {9,0,1,2};

        int[][] d = {a,b,c};

        for(int k[] : d)
        {
            for (int i : k)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static class Student{
        String id;
        String name;
        String gender;

        public Student(String id, String name, String gender) {
            this.id = id;
            this.name = name;
            this.gender = gender;
        }
    }
}
