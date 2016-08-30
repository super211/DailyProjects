package sg.com.java.ncs.inter;

public class MyClass {
	static String s1 = "I am unique!";
	static String str1 = "china";
	public static void main(String[] args){
		String s2 = "I am unique!";
		String s3 = new String(s1);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3 == s1);
		System.out.println(s3.equals(s1));
		System.out.println(TestClass.s4 == s1);
		
		//String str1 = "china";
		String str2 = new String(str1);
		String str3 = "china";
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
	}
	
}
class TestClass{
	static String s4 = "I am unique!";
}
