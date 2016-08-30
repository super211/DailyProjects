package sg.com.java.interv.eye18_sums_1;

/* http://mouselearnjava.iteye.com/blog/2152420
 * http://thecodesample.com/?p=291
计算非负数二进制形式中1的个数. 
 */

public class Example {

	/**
	 * 通过Integer#toBinaryString方法获得二进制表达式, 替换掉0,剩余的都是1, 然后直接计算剩余字符串的长度来得到1的个数.
	 * 
	 */
	public int method1(int num) {
		if (num < 0) {
			throw new IllegalArgumentException("请输入一个非负整数.");
		}
		return Integer.toBinaryString(num).replaceAll("0", "").length();
	}

	/**
	 * 该方法采用的思想是:
	 * 把一个整数减1,然后再与原来整数做与运算(&),会把该整数最右边一个1变成0,那么一个整数的二进制表示中有多少个1就可以进行多少次这样的操作.
	 */
	public int method2(int num) {
		if (num < 0) {
			throw new IllegalArgumentException("请输入一个非负整数.");
		}
		int count = num == 0 ? 0 : 1;
		while ((num = (num & (num - 1))) > 0) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Example m = new Example();
		for (int i = 980; i < 1000; i++) {
			System.out
					.printf("整数%3d的二进制表示为%s,其中1的个数,\nMethod1()的结果是%d,\nMethod2()的结果是%d\n\n",
							i, Integer.toBinaryString(i), m.method1(i),
							m.method2(i));
		}
	}

}