package sg.com.java.interv.eye8_sumsubsets;

import java.util.Arrays;

public class GetAllSubsets {

	/** Set a value for target sum */
	public static final int TARGET_SUM = 15;

	public void populateSubset(final int[] data, int fromIndex,
			final int[] stack, final int stacklen, final int target) {
		if (target == 0) {
			// exact match of our target. Success!
			printResult(Arrays.copyOf(stack, stacklen));
			return;
		}

		while (fromIndex < data.length && data[fromIndex] > target) {
			// take advantage of sorted data.
			// we can skip all values that are too large.
			fromIndex++;
		}

		while (fromIndex < data.length && data[fromIndex] <= target) {
			// stop looping when we run out of data, or when we overflow our
			// target.
			stack[stacklen] = data[fromIndex];
			populateSubset(data, fromIndex + 1, stack, stacklen + 1, target
					- data[fromIndex]);
			fromIndex++;
		}
	}

	private void printResult(int[] copyOf) {
		StringBuilder sb = new StringBuilder();
		sb.append(TARGET_SUM).append(" = ");
		for (Integer i : copyOf) {
			sb.append(i).append("+");
		}
		System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
	}

	private static final int[] DATA = { 1, 3, 4, 5, 6, 2, 7, 8, 9, 10, 11, 13,
			14, 15 };

	public static void main(String[] args) {
		GetAllSubsets example = new GetAllSubsets();
		example.populateSubset(DATA, 0, new int[DATA.length], 0, 15);
	}
}