package sg.com.java.interv.eye4_mergearray;

/*http://mouselearnjava.iteye.com/blog/2152420
http://thecodesample.com/?p=731
给定两个有序数组，给出一个合并后的有序数组。
 */

import java.util.Arrays;

public class MergeTwoSortIntegerArrays {

	public static int[] merge(int[] a, int[] b) {

		if (a == null)
			return b;

		if (b == null)
			return a;

		int len1 = a.length;
		int len2 = b.length;

		int result[] = new int[len1 + len2];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < len1 && j < len2) {
			if (a[i] < b[j]) {
				result[k++] = a[i];
				i++;
			} else {
				result[k++] = b[j];
				j++;
			}
		}
		System.arraycopy(a, i, result, k, (len1 - i));
		System.arraycopy(b, j, result, k, (len2 - j));
		return result;
	}

	public static void main(String[] args) {

		int[] a = { -1, 5, 9, 15, 85, 98, 100 };
		int[] b = { -2, 6, 8, 14, 73, 85, 97 };

		// [-2, -1, 5, 6, 8, 9, 14, 15, 73, 85, 85, 97, 98, 100]
		int[] result = MergeTwoSortIntegerArrays.merge(a, b);
		System.out.println(Arrays.toString(result));

	}
}
