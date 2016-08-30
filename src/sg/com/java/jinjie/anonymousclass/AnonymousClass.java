package sg.com.java.jinjie.anonymousclass;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousClass {

	public static void main(String[] args) {
		String[] array = {"Apple","Cat", "Boy"};
		System.out.println(Arrays.toString(reverseSort(array)));
	}

	private static String[] reverseSort(String[] array){
		Comparator<String> reverseComparator = new Comparator<String>(){
			/*Anonymous Class*/
			@Override
			public int compare(String string1, String string2) {
				// TODO Auto-generated method stub
				return string2.compareTo(string1);
			}
			
		};
		Arrays.sort(array, reverseComparator);
		return array;
	}
}
