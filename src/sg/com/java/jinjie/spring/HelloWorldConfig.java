package sg.com.java.jinjie.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
	
	@Bean(initMethod="init", destroyMethod="cleanup") //Initialization and destruction callback methods, much like Spring XML's init-method and destroy-method attributes on the bean element
	public Foo foo(){
		return new Foo(bar()); 
	}
	
	@Bean
	public Bar bar(){
		return new Bar();
	}
}
