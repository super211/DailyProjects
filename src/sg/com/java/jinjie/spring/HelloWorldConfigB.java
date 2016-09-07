package sg.com.java.jinjie.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(HelloWorldConfig.class)
public class HelloWorldConfigB {
	@Bean
	public Bar helloWorldConfigB(){
		return new Bar();
	}
}
