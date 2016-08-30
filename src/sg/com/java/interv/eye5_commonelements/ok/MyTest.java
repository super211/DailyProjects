package sg.com.java.interv.eye5_commonelements.ok;

/*http://mouselearnjava.iteye.com/blog/2152420
http://thecodesample.com/?p=735
找出三个有序数组共有的元素。
 */

import java.util.ArrayList;
import java.util.List;

public class MyTest {

	public static void main(String[] args) {
		int[] a = { 1, 5, 10, 20, 40, 80 };
		int[] b = { 1, 6, 7, 20, 80, 100 };
		int[] c = { 1, 3, 4, 15, 20, 30, 70, 80, 120 };
		
		List<Integer> list1=new ArrayList<Integer>(a.length);
		//List<Integer> list2=new ArrayList<Integer>(b.length);
		//List<Integer> list3=new ArrayList<Integer>(c.length);
		ArrayList<Integer> list4=new ArrayList<Integer>();
		for(int val:a){
			list1.add(val);
		}
		for(int val:b){
			//list2.add(val);
			if(list1.contains(val)){
				list4.add(val);
			}
		}
		for(int val:c){
			//list3.add(val);
			if(list4.contains(val)){
				System.out.println(val);
			}
		}
		
	}

}
