package sg.com.nets.pattern.test;

interface Car{
	public void drive();
}

class Benz implements Car{
	public void drive(){
		System.out.println("Drive a Benz");
	}
}

class Bmw implements Car{
	public void drive(){
		System.out.println("Drive a Bmw");
	}
}

class Factory{
	public static Car create(String clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return (Car)Class.forName(clazz).newInstance();
	}
}

public class PatternTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Car benzCar = Factory.create("sg.com.nets.pattern.test.Benz");
		benzCar.drive();
		Car bmwCar = Factory.create("sg.com.nets.pattern.test.Bmw");
		bmwCar.drive();
	}
}

