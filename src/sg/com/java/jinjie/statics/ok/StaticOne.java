package sg.com.java.jinjie.statics.ok;

/*
 |---类加载---|---------类实例化--------| 
 静态代码块----->非静态代码块------>类构造方法 
 */

class Static {
	public int a;

	static {
		System.out.println("Static静态语句块");
	}

	public Static() {
		System.out.println("Static默认无参构造器");
	}

	{
		System.out.println("Static非静态语句块");
	}
}

/**
 * @author gongping
 *
 */
public class StaticOne extends Static {
	static int i = 1; // 定义一个静态变量i
	int j = 1; // 定一个变量j
	static int k = 0;

	// 定义一个静态方法
	public StaticOne() {
		System.out.println("StaticOne默认无参构造器");
	}

	// 定义一个static代码块
	static {
		k = 1;
		//System.out.println(++k);
		System.out.println("StaticOne 静态语句块 k=" + ++k);
	}

	{
		System.out.println("StaticOne非静态语句块 j=" + ++j);
	}

	public static void main(String[] args) {
		StaticOne staticOne = new StaticOne();
	}
}