package sg.com.nets.pattern.factorymethod;

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

interface Factory{
	public Car factory();
}

class BenzFactory implements Factory{
	public Car factory(){
		return new Benz();
	}
}

class BmwFactory implements Factory{
	public Car factory(){
		return new Bmw();
	}
}

public class FactoryMethod {
	public static void main(String[] args){
		Factory benzFactory = new BenzFactory();
		Car benzCar = benzFactory.factory();
		benzCar.drive();
		
		Factory bmwFactory = new BmwFactory();
		Car bmwCar = bmwFactory.factory();
		bmwCar.drive();
	}
}
