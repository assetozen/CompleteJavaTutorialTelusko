package com.assegd.demos.miditecbestpractices.enumpractice;

public enum EnumPractice {

	INSTANCE, STUDENT_1("Assegd", 30), STUDENT_2("Sara", 25, "Bremen High School");

	private final String name;
	private final int age;
	private final String school;

	private EnumPractice() {
		this.name = "";
		this.age = 0;
		this.school = "";
	}

	private EnumPractice(String name, int age) {
		this.name = name;
		this.age = age;
		school = "";
	}

	private EnumPractice(String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public void show() {
		System.out.println(" Singleton using Enum in Java!!");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSchool() {
		return school;
	}

}
