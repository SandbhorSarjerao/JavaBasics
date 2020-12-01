package OOPs;

public class Method_Overriding {
	public static void main(String[] args) {
		Parent parentObj = new Parent();
		System.out.println("Value Of a from Parent: " + parentObj.a);
		System.out.println("show() method from Parent: ");
		parentObj.show();
		
		Child childObj = new Child();
		System.out.println("Value Of a from Child: " + childObj.a);
		System.out.println("show() method from Child Class: ");
		childObj.show();
	}
}

class Parent {
	public Parent() { 
		// Constructor
		System.out.println("Parent Class Constructor...");
	}

	int a = 10;

	public void show() {
		System.out.println("In Parent Class show() method...");
	}
}

class Child extends Parent {
	public Child() {
		// Constructor
		super();
		System.out.println("Child Class Constructor...");
	}

	int a = 30;
	public void show() {
		a = 50;
		System.out.println("In Child Class show() method...");
		System.out.println("Child Class variable value : "+this.a);
		
		System.out.println("Parent Class variable & show() method...");
		System.out.println("Parent Class variable value : "+super.a);
		super.show();
	}
}
