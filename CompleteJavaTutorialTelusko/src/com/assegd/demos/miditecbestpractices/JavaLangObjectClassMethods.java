package com.assegd.demos.miditecbestpractices;

import java.util.ArrayList;
import java.util.Iterator;


//Link:- https://en.wikibooks.org/wiki/Java_Programming/API/java.lang.Object

public class JavaLangObjectClassMethods {
	public static void main(String[] args) {
		System.out.println("Hallo customer");
		Customer customer1 = new Customer("Assegd", "Addis Ababa");
		if (isCustomerExist(customer1)) {
			System.out.println("Customer with name \"" + customer1.getName() + "\" was found!");
		} else {
			System.out.println("Customer with name \"" + customer1.getName() + "\" was NOT found!");
		}
	}

	public static boolean isCustomerExist(Customer customer) {
		Customer customer1 = new Customer("Assegd", "Addis Ababa");
		Customer customer2 = new Customer("Sara", "Amiens");
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);

		boolean isExist = false;
		Iterator<Customer> iter = customers.iterator();
		/*
		 * while (iter.hasNext()) { if (customer.equals((Customer)iter.next())) {
		 * isExist = true; } }
		 */
		
		if (customers.contains(customer)) {
			isExist = true;
		}
		return isExist;

	}
}

class Customer {

	public Customer(String name, String city) {
		super();
		Name = name;
		City = city;
	}

	private String Name;
	private String City;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

}
