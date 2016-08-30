package sg.com.java.ncs.inter;

interface MyInsterface{
	
}

public class Test8_instanceof implements MyInsterface {
	//static String s = "";
	static String s;

	public static void main(String[] args){

		System.out.println("s = " + s);
		Test8_instanceof t = new Test8_instanceof();
		
		if(t instanceof MyInsterface){
			System.out.println("I am true interface");
		}else{
			System.out.println("I am false interface");
		}
		
		if(s instanceof String){
			System.out.println("I am true String");
		}else{
			System.out.println("I am false String");
		}
	}
}
