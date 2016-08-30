package sg.com.java.jinjie.finals;

import java.util.*; 

class Apple { 
	
	private float weight; 
	
	public Apple(float weight){ 
		setWeight(weight); 
	} 
	
	public void setWeight(float weight) { 
		this.weight=weight; 
	}
	
	public void print() { 
		System.out.println("Weight is "+String.valueOf(weight)); 
	} 
	
	public void printHashCode() { 
		System.out.println("HashCode:"+String.valueOf(hashCode())); 
	} 
	
} 

public class FinalSample { 
	public static void main(String[]args) { 
		final int a=10; //对于final修饰的基本类型变量，一旦初始化后就不能再被改动 
		//a=20; 
		final Apple apple=new Apple(300f); 
		apple.print(); 
		apple.printHashCode(); //对于final修饰的引用类型变量，仅仅是其指向不能变，可是其指向的对象本身能够改变。 
		apple.setWeight(350f); 
		apple.print(); 
		apple.printHashCode(); 
		
		//The final local variable apple cannot be assigned. It must be blank and not using a compound assignment
		//apple = new Apple(400f);
	} 
}
