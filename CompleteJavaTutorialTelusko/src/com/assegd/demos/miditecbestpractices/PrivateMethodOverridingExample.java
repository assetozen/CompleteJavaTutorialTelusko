package com.assegd.demos.miditecbestpractices;



//Link:https://www.java67.com/2013/08/can-we-override-private-method-in-java-inner-class.html

/**
 * Java Program to demonstrate, private method can not be overridden in Java,
 * not even on Inner classes. Main reason of that behavior is because they are
 * bonded using static binding in Java.
 */
public class PrivateMethodOverridingExample {
	private String i_m_private = "I am private member, not accessible outside this Class";

	private void privateMethod() {
		System.out.println("Private method or Outer class");
	}
	
	public static void main(String[] args) {
		PrivateMethodOverridingExample outerClass = new PrivateMethodOverridingExample();
		NestedClass nc = outerClass.new NestedClass();
		nc.showPrivate();
		outerClass.privateMethod(); // This will not call private method from inner class, 
									// which shows you can not override 
									// private method inside inner class.

	}
	
	class NestedClass extends PrivateMethodOverridingExample{
		public void showPrivate() {
			System.out.println("Accessing Private members of Outer class: " + i_m_private);
			privateMethod();
		}
		
		/* private method trying to be overridden, instead it’s just hiding parent class method. */
		private void privateMethod() {
			System.out.println("Private method of Nested Class");
		}
	}
}


