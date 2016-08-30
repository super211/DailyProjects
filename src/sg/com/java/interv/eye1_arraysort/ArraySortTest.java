package sg.com.java.interv.eye1_arraysort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySortTest {
	public static void main(String[] args){
		int[] input = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12, 15, 19, 30 };
		Arrays.sort(input);
		/*for(int i=0; i<input.length; i++){
			System.out.println(input[i]);
		}*/
		
		for(int i:input){
			System.out.println(i);
		}
	}
}
