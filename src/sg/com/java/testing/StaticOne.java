package sg.com.java.testing;

public class StaticOne {
	static int i = 1; // 定义一个静态变量i
	int j = 1; // 定一个变量j
	static int k=0;

	// 定义一个静态方法
	static void doSomeThing() {
		System.out.println(++i);
	}

	// 定义一个static代码块
	static {
		//k = 1;
		System.out.println(++k);
	}
	
	{
		System.out.println("j:" + j);
	}

	public static void main(String[] args){
		StaticOne staticOne = new StaticOne();
	}
}