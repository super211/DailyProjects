package sg.com.java.jinjie.finals2;

public class Apple2 {
	private final AppleTag appleTag;

	public Apple2(AppleTag appleTag) {//防止构造函数改变值，让final变量与外界充分隔离开，如本例中使类的使用者能获取对应的值，可是无法获取appleTag
		this.appleTag = new AppleTag(appleTag.getWeight(), appleTag.getSize());
	}

	public AppleTag getAppleTag() {
		return new AppleTag(appleTag.getWeight(), appleTag.getSize());
	}

	public void print() {
		System.out.println("Weight:" + String.valueOf(appleTag.getWeight())
				+ " Size:" + String.valueOf(appleTag.getSize()));
	}

	public static void main(String[] args) {
		AppleTag appleTag = new AppleTag(300f, 10.3f);
		Apple2 apple = new Apple2(appleTag); //防止构造函数改变值，让final变量与外界充分隔离开，如本例中使类的使用者能获取对应的值，可是无法获取appleTag
		apple.print();

		appleTag.setWeight(13f);
		apple.print();

		AppleTag tag = apple.getAppleTag();
		tag.setSize(100.3f);
		apple.print();
	}

}