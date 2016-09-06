package sg.com.java.jinjie.spring;

//http://www.tutorialspoint.com/spring/spring_bean_scopes.htm

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld)context.getBean("helloWorld");
		objA.setMessage("I am object A"); //I am object A
		System.out.println(objA.getMessage());
		
		HelloWorld objB = (HelloWorld)context.getBean("helloWorld");
		System.out.println(objB.getMessage()); //I am object A
	}

}
