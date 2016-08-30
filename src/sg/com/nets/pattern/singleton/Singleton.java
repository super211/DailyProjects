package sg.com.nets.pattern.singleton;

class Car{
    public final static Car car = new Car();
   
    private Car(){

    }

    public synchronized static Car getInstance(){
         return car;
    }
    
    public void drive(){
    	System.out.println("Drive 1st car!");
    }
}

public class Singleton {
	public static void main(String[] args){
		Car car1 = Car.getInstance();
		car1.drive();
		
		Car car2 = Car.getInstance();
		car2.drive();
	}
}
