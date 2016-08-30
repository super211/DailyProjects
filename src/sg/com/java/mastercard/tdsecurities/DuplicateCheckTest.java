package sg.com.java.mastercard.tdsecurities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCheckTest {
	public static void main(String[] args){
		//String[] strArrayA = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		//String[] strArrayB = {"a", "b", "c", "d", "e", "k", "l", "m", "n", "o"};
		
		int[] strArrayA = {1,2,3,4,5,6,7,8,9,10};
		int[] strArrayB = {1,2,3,4,5,11,12,13,14,15};
		Set set = new HashSet();
		for(int i=0; i<10; i++){
			set.add(strArrayA[i]);
		}
		
		for(int j=0; j<10; j++){
			if(!set.add(strArrayB[j])){
				System.out.println(strArrayB[j]);
			}
		}
		
		checkDuplicate(strArrayA, strArrayB);
	}
	
	static void checkDuplicate(int[] arrayA, int[] arrayB){
		//int len = max(arrayA.length, arrayB.length);
		List<Integer> listArray = new ArrayList<Integer>();
		//List<Integer> list = Arrays.asList(ArrayUtils.toObject(array));
		for(int val: arrayB){
			listArray.add(val);
		}
		for(int i=0; i<arrayA.length; i++){
			if(listArray.contains(arrayA[i])){
				System.out.print(arrayA[i]);
			}
		}
	}
	
	static int max(int A, int B){
		return A>B?A:B;
	}
}
