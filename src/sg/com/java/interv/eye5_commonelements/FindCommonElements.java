package sg.com.java.interv.eye5_commonelements;

/*http://mouselearnjava.iteye.com/blog/2152420
http://thecodesample.com/?p=735
找出三个有序数组共有的元素。
 */

import java.util.ArrayList;
import java.util.List;

public class FindCommonElements {

	public static List<Integer> commonElements(int[] a, int[] b, int[] c) {
		int len1 = a.length;
		int len2 = b.length;
		int len3 = c.length;

		List<Integer> result = new ArrayList<Integer>();
		int i = 0, j = 0, k = 0;
		while (i < len1 && j < len2 && k < len3) {
			if (a[i] == b[j] && b[j] == c[k]) {
				result.add(a[i]);
				i++;
				j++;
				k++;
			} else {
				int max = max(a[i], b[j], c[k]);
				while (i < len1 && a[i] < max)
					i++;
				while (j < b.length && b[j] < max)
					j++;
				while (k < c.length && c[k] < max)
					k++;
			}
		}
		return result;
	}

	private static int max(int a, int b, int c) {
		return max(max(a, b), c);
	}

	private static int max(int a, int b) {
		return a >= b ? a : b;
	}

	public static void main(String[] args) {
		int[] a = { 1, 5, 10, 20, 40, 80 };
		int[] b = { 1, 6, 7, 20, 80, 100 };
		int[] c = { 1, 3, 4, 15, 20, 30, 70, 80, 120 };

		List<Integer> result = FindCommonElements.commonElements(a, b, c);
		// [1, 20, 80]
		System.out.println(result);
	}

}