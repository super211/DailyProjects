package sg.com.java.jinjie.string;

public class StringTest {
	public static void main(String[] args){
		String s = new String("Hello World!");//With this method, we can only use "equal"
		String s2 = new String("Hello World!");
		//String s = "Hello World!"; //With this method, we can use "=="
		//String s2 = "Hello World!";
		int len = s.length();
		char c = s.charAt(2);
		String subStr = s.substring(0,4);
		int ind = s.indexOf("World");
		boolean start = s.startsWith("H");
		boolean end = s.endsWith("!");
		boolean equal = s.equals("Good World!");
		int com = s.compareTo("Hello Zerd!");
		String trim = s.trim();
		String lower = s.toLowerCase();
		String upper = s.toUpperCase();
		String replace = s.replace("World", "China");
		
		System.out.println(s);
		System.out.println(len);
		System.out.println(c);
		System.out.println(subStr);
		System.out.println(ind);
		System.out.println(start);
		System.out.println(end);
		System.out.println(equal);
		System.out.println(com);
		System.out.println(s == s2);
		System.out.println(trim);
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(replace);
	}
}
