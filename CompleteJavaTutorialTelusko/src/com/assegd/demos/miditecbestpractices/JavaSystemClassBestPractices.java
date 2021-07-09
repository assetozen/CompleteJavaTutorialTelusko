package com.assegd.demos.miditecbestpractices;

public class JavaSystemClassBestPractices {
	public static void main(String[] args) {
		System.out.println("Assegd's CURRENT USER DIRECTORY:- "+ System.getProperty("user.dir"));
		System.out.println("Assegd's SYSTEM ALL PROPERTIES :- "+ System.getProperties() );
	}

}
