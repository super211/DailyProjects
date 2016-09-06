package sg.com.java.jinjie.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
	
	@Bean
	public Foo foo(){
		return new Foo(bar()); 
	}
	
	@Bean
	public Bar bar(){
		return new Bar();
	}
}
