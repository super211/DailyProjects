package sg.com.java.interv.eye1_arraysort.ok;

import java.util.Arrays;
/* http://mouselearnjava.iteye.com/blog/2152420
 * http://thecodesample.com/?p=701
给定一个有序且含有重复数据的数组，写一个程序，去除重复的数值并返回一个拥有唯一数值的新的数组。
 */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


//My emplementation, better
public class RemoveDuplicateTest {
	public static int[] removeDuplicateElements(int[] input){
		if(input == null || input.length ==0){
			throw new IllegalArgumentException("Input array cannot be null");
		}
		
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		
		int smallIndex = 0;
		int bigIndex = 1;
		
		while(bigIndex < input.length){
			if(input[bigIndex] == input[smallIndex]){
				bigIndex++;
			}else{
				input[++smallIndex]=input[bigIndex++];
			}
		}
		
		int length = smallIndex + 1;
		int[] output = new int[length];
		System.arraycopy(input, 0, output, 0, length);
		
		return output;
	}
	
	public static void main(String[] args){
		int[] input = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12, 15, 19, 30 };
		//int[] input = {2};
		//int[] input = null;
		
		//////Use HashSet//////
		Set<Integer> hashSet = new HashSet<Integer>();
		for(int val:input){
			hashSet.add(val);
		}
		
		System.out.println(hashSet.toString());
		
		//////Use TreeSet//////
		Set<Integer> treeSet = new TreeSet<Integer>();
		for(int val:input){
			treeSet.add(val);
		}
		System.out.println(treeSet.toString());
		
		int[] output = removeDuplicateElements(input);
		//System.out.println(output.toString());
		System.out.println(Arrays.toString(output));
	}
}
