package sg.com.java.jinjie.polymorphism;

//Superclass
class Base {

	// Static method in base class which will be hidden in subclass
	public static void display() {
		System.out.println("Static or class method from Base");
	}

	// Non-static method which will be overridden in derived class
	//public final void print() { //final=no inheritence
	public void print() {
		System.out.println("Non-static or Instance method from Base");
	}
	
	public void print(String str) {
		System.out.println("Non-static or Instance method from Base" + str);
	}
}

// Subclass
class Derived extends Base {

	// This method hides display() in Base
	public static void display() {
		System.out.println("Static or class method from Derived");
	}

	// This method overrides print() in Base
	public void print() {
		System.out.println("Non-static or Instance method from Derived");
	}
	
	public void print(String str) {
		System.out.println("Non-static or Instance method from Derived" + str);
	}
}

// Driver class
public class Test {
	public static void main(String args[]) {
		Base base = new Base();
		base.print(" hello");
		
		Base obj1 = new Derived();

		// As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it
		// calls Base's display()
		obj1.display();

		// Here overriding works and Derive's print() is called
		obj1.print();
		obj1.print("word");
	}
}