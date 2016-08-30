package sg.com.java.interv.eye20_zerototal;

import java.util.regex.Pattern;

public class NumberOfZerosExample {
	public static void main(String[] args){
		String str = Integer.toBinaryString(9);
		System.out.println(str);
		int len = str.replaceAll("0", "").length();
		System.out.println(len);
		
		boolean b1 = Pattern.compile("[\\d]+").matcher("0123").matches();
		boolean b2 = Pattern.compile("[\\w]+").matcher("hello").matches();
		System.out.println(b1);
		System.out.println(b2);		
	}
}
