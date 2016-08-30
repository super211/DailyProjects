package sg.com.java.jinjie.container;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args){
		List<String > ll = new ArrayList<String>();
		ll.add("good");
		ll.add("bad");
		ll.add("shit");
		ll.add("shit");
		ll.remove(0);
		System.out.println(ll.get(1));
		System.out.println(ll.size());
		
		if(ll.contains("shit")){
			System.out.println("It contains shit");
		}else{
			System.out.println("It doesn't contains shit");
		}
	}
}
