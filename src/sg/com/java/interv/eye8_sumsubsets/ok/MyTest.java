package sg.com.java.interv.eye8_sumsubsets.ok;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

	/*private static final int[] DATA = { 1, 3, 4, 5, 6, 2, 7, 8, 9, 10, 11, 13,
			14, 15 };*/
	
	public static void main(String[] args) {
		int[] input = { 1, 3, 4, 5, 6, 2, 7, 8, 9, 10, 11, 13, 14, 15 };
		subSets(input);
	}
	public static void subSets(int[] input){
		List<Integer> list = new ArrayList<Integer>(input.length);
		for(int val:input){
			list.add(val);
		}
		for(int i=0; i<list.size(); i++){
			int current = list.get(i);
			list.remove(current);
			if(current > 15){
				continue;
			}
			int temp = 15 - current;
			if(list.contains(temp)){
				System.out.println("15 = " + current + " + " + temp);
			}
		}
	}
}
