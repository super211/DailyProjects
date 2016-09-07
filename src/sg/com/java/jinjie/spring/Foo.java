package sg.com.java.jinjie.spring;

public class Foo {
	
	public void init(){
		System.out.println("Foo Initianization");
	}
	
	public Foo(Bar bar){
		
		System.out.println("Foo: " + bar.getMessage());
	}
	
	public void cleanup(){
		System.out.println("Foo Cleanup");
	}
}
