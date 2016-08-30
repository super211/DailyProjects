package sg.com.java.jinjie.finals;

class Apple2{
	String type;
	//final String type;
	
	public Apple2(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void print(){
		System.out.println("Type is: " + type);
	}
}

public class AppleTest {
	public static void main(String[] args){
		String appleType = new String("Red Apple");
		Apple2 apple = new Apple2(appleType);
		apple.print();
		
		appleType = "Green Apple";
		apple.print();
		
		String type = apple.getType();
		type = "Yellow Apple";
		apple.print();
	}	
}
