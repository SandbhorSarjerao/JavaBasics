package OOPs;

public class This_and_Super_keyword {
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
}

class Parent_Class {
	public Parent_Class() {
		// Constructor
		System.out.println("Parent Class Constructor...");
	}

	int a = 10;

	public void show() {
		System.out.println("In Parent Class show() method...");
	}
}

class Child_Class extends Parent_Class {
	public Child_Class() {
		// Constructor
		super();
		System.out.println("Child Class Constructor...");
	}

	int a = 30;
	public void show() {
		System.out.println("In Child Class show() method...");
		System.out.println("Child Class variable value : "+this.a);
		
		System.out.println("Parent Class variable & show() method...");
		System.out.println("Parent Class variable value : "+super.a);
		super.show();
	}
}
