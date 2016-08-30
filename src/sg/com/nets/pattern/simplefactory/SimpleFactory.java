package sg.com.nets.pattern.simplefactory;



interface Car {
	//public abstract void drive();
	public void drive();
}

class Benz implements Car {
	public void drive() {
		System.out.println("Driving a benz");
	}
}

class Bmw implements Car {
	public void drive() {
		System.out.println("Driving a bmw");
	}
}


/*class Factory{
    public static Car factory(String clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
              return (Car)Class.forName(clazz).newInstance(); //clazzΪ��Ҫ�����Ķ����������༰��·��
    }
}*/

/**
 * 
 * @author gongping
 * Method 1
 */
class Factory{
    public Car factory(Class clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
         //return (Car) Class.forName(clazz.getName()).newInstance();
         return (Car)clazz.newInstance(); //OK
    }
}


public class SimpleFactory {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/**
		 * 
		 * @author gongping
		 * Method 1
		 */
		Factory factory = new Factory();
		Car benzCar = factory.factory(Benz.class);
		benzCar.drive();
		
		Car bmwCar = factory.factory(Bmw.class);
		bmwCar.drive();
		
		/*Car benzCar = Factory.factory("sg.com.nets.pattern.Benz");
		benzCar.drive();*/
	}
}
