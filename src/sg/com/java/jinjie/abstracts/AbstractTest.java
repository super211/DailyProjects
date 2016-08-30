/*
抽象类遵循的原则：

（1）abstract关键字只能修饰类和方法，不能修饰字段。
（2）抽象类不能被实例化（无法使用new关键字创建对象实例），只能被继承。
（3）抽象类可以包含属性，方法，构造方法，初始化块，内部类，枚举类，和普通类一样，普通方法一定要实现，变量可以初始化或不初始化但不能初始化后在抽象类中重新赋值或操作该变量（只能在子类中改变该变量）。
（4）抽象类中的抽象方法（加了abstract关键字的方法）不能实现。
（5）含有抽象方法的类必须定义成抽象类。
 
扩展：抽象类和接口的区别，做个总结吧：
（1）接口是公开的，里面不能有私有的方法或变量，是用于让别人使用的，而抽象类是可以有私有方法或私有变量的。

（2）abstract class 在 Java 语言中表示的是一种继承关系，一个类只能使用一次继承关系。但是，一个类却可以实现多个interface，实现多重继承。接口还有标识（里面没有任何方法，如Remote接口）和数据共享（里面的变量全是常量）的作用。

（3）在abstract class 中可以有自己的数据成员，也可以有非abstarct的成员方法，而在interface中，只能够有静态的不能被修改的数据成员（也就是必须是 static final的，不过在 interface中一般不定义数据成员），所有的成员方法默认都是 public abstract 类型的。

（4）abstract class和interface所反映出的设计理念不同。其实abstract class表示的是"is-a"关系，interface表示的是"has-a"关系。

（5）实现接口的一定要实现接口里定义的所有方法，而实现抽象类可以有选择地重写需要用到的方法，一般的应用里，最顶级的是接口，然后是抽象类实现接口，最后才到具体类实现。抽象类中可以有非抽象方法。接口中则不能有实现方法。

（6）接口中定义的变量默认是public static final 型，且必须给其初值，所以实现类中不能重新定义，也不能改变其值。抽象类中的变量默认是 friendly 型，其值可以在子类中重新定义，也可以在子类中重新赋值。
*/
package sg.com.java.jinjie.abstracts;

abstract class MyClass{
	public int constInt = 5;
	//constInt = constInt + 5;
	//public int method();
	/*public abstract void anotherMehtod(){//Abstract methods do not specify a body
		
	}*/
	public void method(){
	
	}
}

public class AbstractTest {
	public static void main(String[] args){
		
	}
}
