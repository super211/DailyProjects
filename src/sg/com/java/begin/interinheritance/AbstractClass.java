package sg.com.java.begin.interinheritance;

public class AbstractClass {
	public static void main(String[] args){
		//Food food = new Food();
		Rice rice = new Rice();
		rice.eat();
		rice.happyFood();
	}
}

abstract class Food{
	public abstract void eat();
	public void happyFood(){
		System.out.println("Good! Eat me!");
	}
}

class Rice extends Food{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat after cooking");
	}
	
}