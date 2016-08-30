package sg.com.java.jinjie.statics.ok;

// https://www.evernote.com/shard/s325/nl/42768260/efcfc97d-523c-479f-88c5-f89cd2e253f9

//Superclass
class Base {
	
	public static int i = 0;

	// Static method in base class which will be hidden in subclass
	public static void display() {
		System.out.println("Static or class method display from Base");
	}
	
	public static void display2(){
		System.out.println("Static or class method display2 from Base");
	}

	// Non-static method which will be overridden in derived class
	public void print() {
		System.out.println("Non-static or Instance method print from Base");
	}
	
	public void print2() {
		System.out.println("Non-static or Instance method print 2 from Base");
	}
	
	public void print(String str){
		System.out.println("Non-static or Instance method print(str) from Base " + str);
	}
}

// Subclass
class Derived extends Base {

	// This method display() will be hidden in Base
	public static void display() {
		System.out.println("Static or class method display from Derived");
	}
	
	//This instance method cannot override the static method from Base
	/*public void display2(){
		
	}*/

	// This method overrides print() in Base
	public void print() {
		System.out.println("Non-static or Instance method print from Derived");
	}
	
	// This method is unique to the subclass //invokevirtual=dynamic binding
	public void print(String str) {
		System.out.println("Non-static or Instance method print(str) from Derived " + str);
	}
	
	//This static method cannot hide the instance method from Base
	/*public static void print2() {
		System.out.println("Non-static or Instance method from Derived");
	}*/
}

public class TypicalSampleTest {
	public static void main(String[] args){
		Base obj1 = new Derived();
		obj1.display();//The static method display() from the type Base should be accessed in a static way
		obj1.print();
		obj1.print("hellow");
		
		System.out.println("");
		
		Derived obj2 = new Derived();
		obj2.display();
		obj2.print();
		obj2.print("hello");
		
		obj1.i = 1;//The static field Base.i should be accessed in a static way
		System.out.println(obj1.i);
	}
}
