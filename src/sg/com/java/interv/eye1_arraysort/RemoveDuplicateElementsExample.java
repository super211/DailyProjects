package sg.com.java.interv.eye1_arraysort;

/* http://mouselearnjava.iteye.com/blog/2152420
 * http://thecodesample.com/?p=701
给定一个有序且含有重复数据的数组，写一个程序，去除重复的数值并返回一个拥有唯一数值的新的数组。
 */

import java.util.Arrays;

public class RemoveDuplicateElementsExample {

	public int[] removeDuplicates(int[] input) {

		/**
		 * 如果无原始数据
		 */
		if (input == null || input.length == 0) {
			throw new IllegalArgumentException("原始数据不能为空");
		}

		/**
		 * 如果原始数据数组只有一个元素则直接返回
		 */
		int len = input.length;
		if (len == 1) {
			return input;
		}

		// 确保处理的数组是有序的。
		Arrays.sort(input);

		/**
		 * 处理多余1个元素的情况
		 */
		int smallIndex = 0;
		int bigIndex = 1;
		while (bigIndex < len) {
			if (input[bigIndex] == input[smallIndex]) {
				bigIndex++;
			} else {
				input[++smallIndex] = input[bigIndex++];
			}
		}

		int resultLen = smallIndex + 1;
		int[] uniqueResult = new int[resultLen];

		/**
		 * 使用System.arraycopy方法将数据赋值到返回的数组中去
		 */
		System.arraycopy(input, 0, uniqueResult, 0, resultLen);
		return uniqueResult;
	}
}