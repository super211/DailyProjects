package sg.com.java.jinjie.comparator;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

class ObjComparator implements Comparator {

	public int compare(Object o1, Object o2) {

		// 注意把传入的参数转化成当前类型的对象

		CompObj1 co1 = (CompObj1) o1;

		CompObj1 co2 = (CompObj1) o2;

		if (co1.y != co2.y) {

			return co1.y - co2.y;

		} else {

			return co1.x - co2.x;
		}

	}

}

public class CompObj1 {

	int x;

	int y;

	public CompObj1(int n1, int n2) {

		x = n1;

		y = n2;

	}

	// 打印该对象时会自动调用toString方法

	public String toString() {

		return "[x = " + x + ", y = " + y + "]";

	}

	public static void main(String[] args) {

		ArrayList l = new ArrayList();

		l.add(new CompObj1(3, 2));

		l.add(new CompObj1(1, 3));

		l.add(new CompObj1(1, 2));

		System.out.println("before sort");

		for (int i = 0; i < l.size(); i++) {

			System.out.println(l.get(i));

		}

		Collections.sort(l, new ObjComparator());

		System.out.println("after sort");

		for (int i = 0; i < l.size(); i++) {

			System.out.println(l.get(i));

		}

	}

}