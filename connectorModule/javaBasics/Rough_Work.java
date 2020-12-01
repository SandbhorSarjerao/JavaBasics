package javaBasics;

public class Rough_Work {

	public Rough_Work(int no) {
		// Constructor
	}

	private Rough_Work(String name, int no) {
		// Constructor - Overloading with different arguments
	}

	public static void main(String[] args) {
		Parent_Class parentObj = new Parent_Class();
		System.out.println("Value Of a from Parent: " + parentObj.a);
		System.out.println("show() method from Parent: ");
		parentObj.show();

		Child_Class childObj = new Child_Class();
		System.out.println("Value Of a from Child: " + childObj.a);
		System.out.println("show() method from Child Class: ");
		childObj.show();

	}
	
	

	class Rough_Work2 extends Rough_Work{
		// We can create a Class inside another class 
		// Also we can inherit Main Class
		
		public Rough_Work2(int no) {
			super(no);
		}
	}
}

interface Test{
	
}
class Parent_Class {
	public Parent_Class() {
		// Constructor
	}

	int a = 10;

	public static void show() {
		System.out.println("Parent Class show() method...");
	}
}

class Child_Class extends Parent_Class {
	public Child_Class() {
		// Constructor
	}

	int a = 30;

	public static void show() {
		System.out.println("Child Class show() method...");
	}
}