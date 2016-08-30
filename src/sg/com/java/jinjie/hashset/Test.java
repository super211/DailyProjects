package sg.com.java.jinjie.hashset;

/*
 if without hashcode(), 10
 else 1
 */

/*
hashSet是添加一个对象先调用它的hashCode()得到这个对象的hashcode,放入hashSet中这个hashcode值的一个位置,
如果添加的下一个对象的hashcode已经在hashSet中存在,就和这个位置上的其他对象用equals()比较,如果没有相同的对象就放
入hashSet的这个位置(每个位置都用hashcode标号,这样就可以减少比较次数,达到速度的目的).第一个代码没有重写hashCode()
所以每次返回的hashcode都不同,这样hashSet中就有十个不同的位置了,第二个代码重写了hashCode()返回i,因为10个对象的i
都相等,等于说每次都放在同一个位置上,而这个位置上已经有了一个 equals()判定相等的对象,所以最后只有一个对象,
*/


import java.util.*;

class V {
	int i;

	public V(int i) {
		this.i = i;
	}

	public int getI() {
		return this.i;
	}

	public boolean equals(Object o) {
		V v = (V) o;
		System.out.println(v.getI() == this.i);
		return v.getI() == this.i;
	}

	public int hashCode() {
		return i;
	}

	public int compareTo(Object o) {
		V v = (V) o;
		if (v.getI() > this.i)
			return -1;
		else if (v.getI() < this.i)
			return 1;
		return 0;
	}

}

public class Test {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		// for(int i=0; i<10; i++)
		// set.add(new String("test"));
		// System.out.println(set.size());
		// set.clear();
		for (int i = 0; i < 10; i++) {
			set.add(new V(1));

		}

		System.out.println(set.size());

	}
}