package com.assegd.demos.miditecbestpractices;

public class ThreadDemo {
	public static void main(String[] args) {
		threadSleepDemo();

	}

	public static void threadSleepDemo() {
		Object obj = new String();
		try {
			obj.wait();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.print("Hi my name is ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.print(" Assegd");
	}

}
