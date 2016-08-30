package sg.com.java.framework.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class App {
	public static void main(String[] args){
		FirstRouteBuilder routeBuilder = new FirstRouteBuilder();
		CamelContext ctx = new DefaultCamelContext();
		try{
			ctx.addRoutes(routeBuilder);
			ctx.start();
			Thread.sleep(5*60*1000);
			ctx.stop();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}