package sg.com.java.interv.eye3_recursionrevert;

/*http://mouselearnjava.iteye.com/blog/2152420
http://thecodesample.com/?p=712
使用递归算法反转字符串

联想：C语言中可直接使用指针移动，每次打印输出第一位字符串
 */

public class StringReversalWithRecursion {

	public String reverseString(String s) {
		if (s.isEmpty())
			return s;

		return reverseString(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		StringReversalWithRecursion test = new StringReversalWithRecursion();
		System.out.println(test.reverseString("hello world"));
		System.out.println(test.reverseString("1 2 3 4 5 fg h g h"));
	}
}