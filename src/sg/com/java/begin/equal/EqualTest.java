package sg.com.java.begin.equal;

public class EqualTest {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1 == str2);

		String str3 = "hello";
		String str4 = "he" + "llo";
		System.out.println(str3 == str4);
		
		String str5 = "hello";
		String str6 = "he" + new String("llo");
		System.out.println(str5 == str6);
	}

}
