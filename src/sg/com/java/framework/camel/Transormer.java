package sg.com.java.framework.camel;

public class Transormer {
	public String transformContent(String body){
		System.out.println("invoke the transformContent method");
		String upperCaseContent = body.toUpperCase();
		return upperCaseContent;
	}
}
