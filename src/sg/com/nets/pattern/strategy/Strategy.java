package sg.com.nets.pattern.strategy;

interface Car{
	public void drive();
}

class Bmw implements Car{
	public void drive(){
		System.out.println("Drive a Bmw");
	}
}

class Benz implements Car{
	public void drive(){
		System.out.println("Drive a Benz");
	}
}

class Factory{
	private Car  car;
	
	public Factory(Car car){
		this.car = car;
	}
	
	public void drive(){
		this.car.drive();
	}
}

public class Strategy {
	public static void main(String[] args){
		Factory bmwFactory = new Factory(new Bmw());
		bmwFactory.drive();
		Factory benzFactory = new Factory(new Benz());
		benzFactory.drive();
	}
}


