package com.assegd.demos.miditecbestpractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.assegd.demos.designpattern.builder.Phone;

public class ToStringofListAndArrayList {

	public static void main(String[] args) {

		System.out.println(toStringReturner());
		System.out.println(toStringListReturner());
		System.out.print(toStringArrayList().toString());
		
		System.out.println("");
		System.getProperty("java.class.path");
		
		System.out.println(System.getProperty("java.class.path"));

	}

	private static String toStringReturner() {
		Phone phone1 = new Phone("win", 8, "i7", 14.00, 1);
		Phone phone2 = new Phone("win", 8, "i7", 14.00, 1);

		List<Phone> phones = Arrays.asList(phone1, phone2);

		String strPhones = phones.stream().map(p -> p.toString()).collect(Collectors.joining());

		String strPhones2 = phones.stream().map(p -> p.toString()).toArray().toString();

		return strPhones;
	}

	private static List<String> toStringListReturner() {
		// TODO Auto-generated method stub
		Phone phone1 = new Phone("win", 8, "i7", 14.00, 1);
		Phone phone2 = new Phone("win", 8, "i7", 14.00, 1);

		List<Phone> phones = Arrays.asList(phone1, phone2);

		List<String> strPhones3 = phones.stream().map(p -> p.toString()).collect(Collectors.toList());

		return strPhones3;
	}
	
	private static ArrayList<ArrayList<Object>> toStringArrayList() {
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Assegd", 12));
		students.add(new Student("Assefa", 55));
		
		ArrayList<ArrayList<Object>> allStudents = new ArrayList<ArrayList<Object>>();
		ArrayList<Object> stsObjs = new ArrayList<Object>();
		
		for (Student student : students) {
			stsObjs.add(student.getName());
			stsObjs.add(student.getAge());
		}
		allStudents.add(stsObjs);
		
		return allStudents;
	}

}

class Student 
{
	
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	
}
