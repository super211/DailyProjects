package sg.com.java.begin.swap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SwapYihuoTest {
	public static void main(String[] args){
		int a = 2;
		int b = 3;
		
		a = a^b;
		System.out.println(a);
		b = a^b;
		System.out.println(b);
		a = a^b;
		System.out.println(a);
		
		//ChildClass childClass = new ChildClass();
		ChildClass childClass2 = new ChildClass("hello");
	}
	
}

class ParentClass{
	/*public ParentClass(){
		System.out.println("Parent");
	}*/
	
	public ParentClass(String str){
		System.out.println("Parent: " + str);
	}
}

class ChildClass extends ParentClass{
	/*public ChildClass(){
		super();
		System.out.println("Child");
	}*/
	
	public ChildClass(String str){
		super(str);
		System.out.println("Child: " + str);
	}
}


