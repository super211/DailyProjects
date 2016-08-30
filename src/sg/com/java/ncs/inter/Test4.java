package sg.com.java.ncs.inter;

public class Test4 {

	private static String a = "ab";

	public static void main(String[] args) {

		String s1 = "a";

		String s2 = "b";

		String s = s1 + s2;

		System.out.println(s == a);// false

		System.out.println(s.intern() == a);// true

	}

}
