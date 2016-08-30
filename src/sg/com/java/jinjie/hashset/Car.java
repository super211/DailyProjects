package sg.com.java.jinjie.hashset;

/*
Hashset在判断是否重复时，按如下机制进行工作当调用了 HashSet 的 add 方法存放对象 obj ， HashSet 会首先调用 obj
的 hasCode 方法得到该对象的哈希码， HashSet 会使用一个算法把它的哈希码转换成一个数组下标，该下标“标记”了 obj 的位置。
如果这个位置上的链表中没有元素，那么就把 obj 对象添加到链表上。如果这个位置上的链表中已经有了元素，则遍历这个链表，调用 obj
的 equals 方法，判断 obj 是否和其中的某个元素重复，如果没有重复的元素，那么就将 obj 添加到链表上；如果有重复的元素，则不会
将 obj 对象存入 HashSet 中。另外自定义子类是继承了Object类的，其中判断重复的equals方法也是继承了父类的，所以我们要重写
equals方法如下：

但是还没结束，上面已经说过了，如果hashCode返回值不同是不可能去调用equals方法去判断的，也就是还要重写hashCode，
保证相同属性的对象hashCode也一样，所以重写hashCode如下：
 */

/*
 hashSet是添加一个对象先调用它的hashCode()得到这个对象的hashcode,放入hashSet中这个hashcode值的一个位置,
 如果添加的下一个对象的hashcode已经在hashSet中存在,就和这个位置上的其他对象用equals()比较,如果没有相同的对象就放
 入hashSet的这个位置(每个位置都用hashcode标号,这样就可以减少比较次数,达到速度的目的).第一个代码没有重写hashCode()
 所以每次返回的hashcode都不同,这样hashSet中就有十个不同的位置了,第二个代码重写了hashCode()返回i,因为10个对象的i
 都相等,等于说每次都放在同一个位置上,而这个位置上已经有了一个 equals()判定相等的对象,所以最后只有一个对象,
 */

import java.util.HashSet;


public class Car {
	private int price;
	private enumcolor color;

	public enum enumcolor {
		red, blue, black, white;
		private String value;

		public void setcolor(String c) {
			this.setColor(c);
		}

		public String getColor() {
			return value;
		}

		public void setColor(String color) {
			this.value = color;
		}
	}

	public Car(int pri, enumcolor ecolor) {
		this.price = pri;
		this.color = ecolor;
	}

	public enumcolor getColor() {
		return color;
	}

	public void setColor(enumcolor color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	protected void showPrice() {
		System.out.println(this.price);
	}
	
	@Override   
    public boolean equals(Object st)   
    {   
        Car tempcar= (Car) st;   
        if (price==tempcar.price) return true;   
        else return false;   
    } 
	
	public int hashCode()   
    {   
        return new Integer(price).hashCode();   
    } 

	public static void main(String args[]) {
		enumcolor cl1 = enumcolor.black;
		enumcolor cl2 = enumcolor.red;
		Car car = new Car(1, cl1);
		Car bus = new Car(1, cl1);
		HashSet<Car> carSet = new HashSet<Car>();
		carSet.add(car);
		carSet.add(bus);
		System.out.println(carSet);
		for (Car ite : carSet) {
			System.out.println(ite);
		}
	}
}