package sg.com.java.jinjie.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.start(); //This method needs ConfigurableApplicationContext
		HelloWorld objA = (HelloWorld)context.getBean("helloWorld");
		objA.setMessage("I am object A"); //I am object A
		System.out.println(objA.getMessage());
		
		//context.refresh(); // the instance of singleton bean 'helloWorld' will be destroyed and recreated.
		
		HelloWorld objB = (HelloWorld)context.getBean("helloWorld");
		System.out.println(objB.getMessage()); //I am object A
		
		context.stop();
		context.close();
	}

}
