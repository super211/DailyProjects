package sg.com.java.jinjie.string.stringbuffer;

public class StringStringBufferTest {
	public static void main(String[] args){
		String str = "abc";
		str.concat("d");
		//str = str.concat("d");
		System.out.println(str);
		
		StringBuffer strB = new StringBuffer("abc");
		strB.append("d");
		System.out.println(strB);
	}
}
