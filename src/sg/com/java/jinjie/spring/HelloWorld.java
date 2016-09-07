package sg.com.java.jinjie.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {
	private String message;
	@Autowired
	private Bar bar;
	
	public static void main(String[] args){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("hello world");
		System.out.println(helloWorld.getMessage());
		System.out.println(helloWorld.getBarMessage());
		
		Foo foo = ctx.getBean(Foo.class);
		
		ApplicationContext ctxB = new AnnotationConfigApplicationContext(HelloWorldConfigB.class);
		Bar bar = ctxB.getBean(Bar.class); // The bean of Bar was defined in HelloWorldConfig, but it can be imported into HelloWorldConfigB
		System.out.println(bar.getMessage());
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public String getBarMessage(){
		return bar.getMessage();
	}
}
