package sg.com.java.interv.eye1_arraysort;

/* 
 * http://mouselearnjava.iteye.com/blog/2152420
 * http://thecodesample.com/?p=701
给定一个有序且含有重复数据的数组，写一个程序，去除重复的数值并返回一个拥有唯一数值的新的数组。
 */

import java.util.Arrays;

public class Main {

	public static void main(String a[]) {
		int[] input = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12, 15, 19, 30 };
		int[] output = new RemoveDuplicateElementsExample()
				.removeDuplicates(input);
		// [2, 3, 6, 8, 9, 10, 12, 15, 19, 30]
		System.out.println(Arrays.toString(output));
	}
}