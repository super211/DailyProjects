/*
结论：如果想要深拷贝一个对象， 这个对象必须要实现Cloneable接口，实现clone方法，并且在clone方法内部，把该对象引用的其他对象也要clone一份 ， 
这就要求这个被引用的对象必须也要实现Cloneable接口并且实现clone方法。
*/
package sg.com.java.jinjie.clone;

class Car implements Cloneable{
	public Engine engine;
	private String a = "hello";
	
	public Car(Engine engine){
		this.engine = engine;
	}
	
	public void drive(){
		System.out.println("Drive a car");
	}
	
	public String getA(){
		return this.a;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		//return (Car)super.clone(); //for Shallow Copy
		Car car = (Car)super.clone();
		car.engine = (Engine)engine.clone(); // the referred object also need to be cloned.
		return car;
	}
}

//Shallow Copy
/*class Engine{
	public void start(){
		System.out.println("Start the car");
	}
}*/

class Engine implements Cloneable{
	
	public Engine(){}
	
	
	public void start(){
		System.out.println("Start the car");
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class DeepCopyTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Car car = new Car(new Engine());
		Car car1 = (Car)car.clone();
		
		System.out.println("car == car1: " + (car == car1));
		System.out.println("engine == engine1: " + (car.engine == car1.engine));
	}
}
