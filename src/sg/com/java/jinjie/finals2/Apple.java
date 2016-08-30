package sg.com.java.jinjie.finals2;

import java.util.*;

class AppleTag {
	private float weight;
	private float size;

	public AppleTag(float weight, float size) {
		setWeight(weight);
		setSize(size);
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getWeight() {
		return weight;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getSize() {
		return size;
	}
}

public class Apple {
	private final AppleTag appleTag;//目的是想让appleTag一旦被初始化，即不被改动

	public Apple(AppleTag appleTag) {
		this.appleTag = appleTag;
	}

	public AppleTag getAppleTag() {
		return appleTag;
	}

	public void print() {
		System.out.println("Weight:" + String.valueOf(appleTag.getWeight())
				+ " Size:" + String.valueOf(appleTag.getSize()));
	}

	public static void main(String[] args) {
		AppleTag appleTag = new AppleTag(300f, 10.3f);
		appleTag = new AppleTag(400f, 14.0f);//（1）通过构造函数的实参进行改动appleTag
		Apple apple = new Apple(appleTag);
		apple.print();

		appleTag.setWeight(13f);
		apple.print();

		AppleTag tag = apple.getAppleTag();//(2) 利用getAppleTag()函数的返回值对appleTag进行改动
		tag.setSize(100.3f);
		apple.print();
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getPriority());
		Thread.yield();
		System.out.println(thread.getPriority());
	}

}