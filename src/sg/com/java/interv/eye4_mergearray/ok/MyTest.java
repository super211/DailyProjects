package sg.com.java.interv.eye4_mergearray.ok;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*http://mouselearnjava.iteye.com/blog/2152420
http://thecodesample.com/?p=731
给定两个有序数组，给出一个合并后的有序数组。
 */

public class MyTest {
	public static void main(String[] args){
		int[] array1 = {1,3,5,7};
		int[] array2 = {2,4,6,8};
		
		int length = array1.length + array2.length;
		/*int[] output = new int[length];
		
		System.arraycopy(array1, 0, output, 0, array1.length);
		System.arraycopy(array2, 0, output, array1.length, array2.length);
		System.out.println(Arrays.toString(output));
		Arrays.sort(output);*/
		
		Set<Integer> treeSet = new TreeSet<Integer>();
		for(int val:array1){
			treeSet.add(val);
		}
		for(int val:array2){
			treeSet.add(val);
		}
		System.out.println(treeSet.toString());
		
		int[] output = mergeArray(array1, array2);
		
		System.out.println(Arrays.toString(output));
	}
	
	public static int[] mergeArray(int[] array1, int[] array2){
		int len1 = array1.length;
		int len2 = array2.length;
		int i=0, j=0, k=0;
		int[] output = new int[len1+len1];
		
		while(i<len1 && j<len2){
			if(array1[i]<array2[j]){
				output[k++]=array1[i++];
			}else{
				output[k++]=array2[j++];
			}
		}
		
		System.arraycopy(array1, i, output, k, (len1 - i));
	    System.arraycopy(array2, j, output, k, (len2 - j));
		return output;
	}
}
