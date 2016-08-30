package sg.com.java.testing;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args){
		int[] array = {12,4,3,22,8};
		Set<Integer> treeSet = new TreeSet<Integer>();
		for(int val:array){
			treeSet.add(val);
		}
		for(int val:treeSet){
			System.out.println(val);
		}
	}
}
