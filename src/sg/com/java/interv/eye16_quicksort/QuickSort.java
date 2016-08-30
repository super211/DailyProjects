package sg.com.java.interv.eye16_quicksort;

import java.util.Arrays;

public class QuickSort {
	public static void sort(int[] number) {
		sort(number, 0, number.length - 1);
	}

	private static void sort(int[] number, int left, int right) {
		if (left < right) {
			int q = partition(number, left, right);
			sort(number, left, q - 1);
			sort(number, q + 1, right);
		}

	}

	private static int partition(int number[], int left, int right) {

		int s = number[right];
		int i = left - 1;

		for (int j = left; j < right; j++) {
			if (number[j] <= s) {
				i++;
				swap(number, i, j);
			}
		}

		swap(number, i + 1, right);

		return i + 1;
	}

	private static void swap(int[] number, int i, int j) {
		int t;
		t = number[i];
		number[i] = number[j];
		number[j] = t;
	}
	
	 public static void main(String[] args) {
		 QuickSort sort = new QuickSort();
	        int[] array = {1,36,58,74,21,14,46,5,7,2,3};
	        System.out.println("排序前：");
	        System.out.println(Arrays.toString(array));
	        sort.sort(array);
	        System.out.println("排序后：");
	        System.out.println(Arrays.toString(array));
	         
	    }
}