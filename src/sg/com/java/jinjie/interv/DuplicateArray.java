package sg.com.java.jinjie.interv;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateArray {
	public static void main(String[] args){
		
		int[] array={10,10,20,10,20,41,55,10,10,10,11,12,66};
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int i=0; i<array.length; i++){
			if(!set.add(array[i])){
				if(set2.add(array[i]))
					System.out.println(array[i]);
			}
		}
		
		/*Iterator it = set2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		for (int x = 0; x < 5; x++) // 控制打印行数
		{
			for (int y = 0; y < 5; y++) // 控制每一行的打印 * 的数目（列数）
			{
				System.out.print("*"); // 打印 *
			}
			System.out.println(); // 内层循环执行完换行！
		}

		//int[] array = {1,3,3,4,5};
		/*int[] array={10,10,20,10,20,41,55,10,10,10,11,12,66};
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<array.length; i++){
			if(!set.add(array[i]))
				System.out.println("Duplicate Entry found: " + array[i]);
		}*/
		
		/*int[] arr = { 10, 10, 20, 10, 20, 41, 55, 10, 10, 10, 11, 12, 66 };
		Set set = new HashSet();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					if (!set.contains(arr[i])) {
						set.add(arr[i]);
						System.out.println("Duplicate Element:" + arr[i]);
					}
				}
			}// end inner for;
		}// end outer for
*/		
	}
}
