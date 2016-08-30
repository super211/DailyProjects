package sg.com.java.begin.access2;

import java.util.ArrayList;
import java.util.List;

class Child3 extends Child2{
	private Child3(){
		
	}
	void test(){
		Child2 child2 = new Child2();
		child2.age  = 11;

	}
	public static void main(String[] args){
		List a = new ArrayList();
		a.add((int)5);
		System.out.println(a.get(0));
	}
}

abstract class GraphicObject {
	// declare fields
	// declare nonabstract methods
	abstract void draw();
}

interface Test{
	public abstract void test();
}