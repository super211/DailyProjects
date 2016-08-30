package sg.com.java.jinjie.comparable;

import java.util.ArrayList;

import java.util.Collections;

public class CompObj implements Comparable {

	int x;

	int y;

	public CompObj(int n1, int n2) {

		x = n1;

		y = n2;

	}

	// 打印该对象时会自动调用toString方法

	public String toString() {

		return "[x = " + x + ", y = " + y + "]";

	}

	// 复写Comparable中的方法

	// 定义比较规则，使CompObj对象可以互相比较

	public int compareTo(Object o) {

		// 注意把传入的参数转化成当前类型的对象

		CompObj co = (CompObj) o;

		if (x != co.x) {

			return x - co.x;

		} else {
			return y - co.y;
		}

	}

	public static void main(String[] args) {

		ArrayList l = new ArrayList();

		l.add(new CompObj(3, 2));

		l.add(new CompObj(1, 3));

		l.add(new CompObj(1, 2));

		System.out.println("before sort");

		for (int i = 0; i < l.size(); i++) {

			System.out.println(l.get(i));

		}

		Collections.sort(l);

		System.out.println("after sort");

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));

		}

	}

}
