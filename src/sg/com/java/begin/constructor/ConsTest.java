/*
构造方法 也是一种方法
唯一的区别在于
1) 构造方法是没有返回类型的。
2）构造方法必须和类同名

4. 下列说法正确的有（）

A． class中的constructor不可省略

B． constructor必须与class同名，但方法不能与class同名

C． constructor在一个对象被new时执行

D．一个class只能定义一个constructor

答案：C 

解析：这里可能会有误区，其实普通的类方法是可以和类名同名的，和构造方法唯一的区分就是，构造方法没有返回类型。

著作权归作者所有。
商业转载请联系作者获得授权，非商业转载请注明出处。
作者：刘可凡
链接：http://www.zhihu.com/question/20473938/answer/15265721
来源：知乎

方法是类的内部组成部分，用来完成类中特定的动作。      方法的定义必须要有返回值类型修饰符，其中一个用来表明方法没有返回值，这个关键字是void。void修饰符是用来表示方法没有返回值，不是null什么的，
就是没有返回值。       构造方法（构造函数）是一种特殊的方法，它有与类相同的名字，没有显式的返回值，它被默认强制void。      所以说构造方法和空方法都是void方法。       再来说空方法和构造方法的区别。构造方法在类被初始化时，
根据参数（涉及到了重载）自动调用构造方法，它伴随对象同时诞生。利用构造函数的特性，可以在构造方法里写一些初始化属性和舒适化调用类私有方法的语句。而方法（包括空方法）相当于对象的动作，在对象需要调用该动作是才会去显
式的声明调用语句调用。

首先没void方法，构造函数与普通方法就是前者能自动初始化。
*/
package sg.com.java.begin.constructor;

public class ConsTest {
	public static void main(String[] args){
		Human aPerson = new Human(160);
		System.out.println(aPerson.getHeight());
		
		Human neZha = new Human(150, "shit");
		System.out.println(neZha.getHeight());
		
		System.out.println("Breath one time: ");
		aPerson.breath();
		
		System.out.println("Breath ten times: ");
		aPerson.breath(10);
		
		aPerson.Human();
		
		Human bPerson = new Human();
		
	}
}

class Human{
	Human(int h){
		this.height = h;
		System.out.println("I'm born");
	}
	
	Human(int h, String s){
		this.height = h;
		System.out.println("Ne Zha: I'm born, " + s);
	}
	
	protected Human(){ //Constructor Method
		System.out.println("Human CONSTRUCTOR method");
	}
	
	public void Human(){//Normal Method
		System.out.println("Human NORMAL method");
	}
	
	int getHeight(){
		return this.height;
	}
	
	void breath(){
		System.out.println("hu...hu...");
	}
	
	void breath(int rep){
		for(int i=0; i<rep; i++){
			System.out.println("hu...hu...");
		}
	}
	
	int height = 170; // explicit initialization
}