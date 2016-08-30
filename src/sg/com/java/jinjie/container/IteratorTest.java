package sg.com.java.jinjie.container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args){
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(4);
		ll.add(5);
		ll.add(2);
		Iterator i = ll.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
