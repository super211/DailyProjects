package sg.com.java.jinjie.container;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args){
		Set<Integer> sl = new HashSet<Integer>();
		sl.add(4);
		sl.add(5);
		sl.add(4);
		sl.remove(5);
		System.out.println(sl);
		System.out.println(sl.size());
		
		if(sl.contains(4)){
			System.out.println("It contains 4");
		}else{
			System.out.println("It doesn't contain 4");
		}
	}
}
