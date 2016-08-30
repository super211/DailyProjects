package sg.com.java.jinjie.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args){
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Vamei", 12);
		m1.put("Jerry", 5);
		m1.put("Tom", 18);
		System.out.println(m1.get("Vamei"));
		
		Set kSet = m1.keySet();
		System.out.println(kSet);
		
		List<Integer> vList = new ArrayList<Integer>(m1.values()); // We should use it like this. Cannot like: (ArrayList<Integer)m1.values();
		System.out.println(vList);
		
		Set<Entry<String, Integer>> set = m1.entrySet();
		System.out.println(set);
		
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		System.out.println(list);
	}
}
