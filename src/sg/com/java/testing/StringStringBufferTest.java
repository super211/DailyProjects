package sg.com.java.testing;

public class StringStringBufferTest {
	private static int staticVariable = 10;
	private int nonStaticVariable;
	
	public static int getStaticVariable(){
		return staticVariable;
	}
	
	public static void main(String[] args){
		String str = "abc";
		str.concat("d");
		//str = str.concat("d");
		System.out.println(str);
		
		StringBuffer strB = new StringBuffer("abc");
		strB.append("d");
		System.out.println(strB);
		
		StringStringBufferTest stringStringBufferTest = new StringStringBufferTest();
		System.out.println(stringStringBufferTest.staticVariable);
		System.out.println(StringStringBufferTest.getStaticVariable());
	}
}
