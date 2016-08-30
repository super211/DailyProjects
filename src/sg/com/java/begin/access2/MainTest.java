package sg.com.java.begin.access2;

import sg.com.java.begin.access.*;

public class MainTest {
	public static void main(String[] args){
		Child3 child3 = new Child3();
		child3.age = 3;
		child3.grade = "3";
		Child2 child2 = new Child2();
		child2.grade = "3";
		Child child = new Child();
		
		if( "Welcome".trim() == "Welcome".trim() )
			System.out.println("Equal");
			else
			System.out.println("Not Equal");
		
		int b1 = 4;
		byte b2 = b1;
		System.out.println(b2);
	}
}
