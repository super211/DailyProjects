package sg.com.java.framework.camel;

import org.apache.camel.builder.RouteBuilder;

public class FirstRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception{
		from("file:C:/00Study/Camel/test/input?noop=true")
		.process(new LogProcessor())
		.bean(new Transormer(), "transformContent")
		.to("file:C:/00Study/Camel/test/output");
	}
}
