package sg.com.java.jinjie.createobj;

class Car{
	public void drive(){
		System.out.println("Drive a Car");	
	}
}

class Factory{
	public Car factory(Class clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		//return (Car)clazz.newInstance();
		return (Car)Class.forName(clazz.getName()).newInstance();
	}
}

public class Method2ReflectionTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Factory fac = new Factory();
		Car car = fac.factory(Car.class);
		car.drive();
	}
}
