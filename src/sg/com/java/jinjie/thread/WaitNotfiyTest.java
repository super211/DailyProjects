package sg.com.java.jinjie.thread;

class MyHouse{
	private boolean pizzaArrived = false;
	
	public void eatPizza() throws InterruptedException{
		synchronized(this){
			while(!pizzaArrived){
				wait();
			}
		}
		System.out.println("YumYum...");
	}
	
	public void pizzaGuy(){
		System.out.println("Sending Pizza");
		synchronized(this){
			this.pizzaArrived = true;
			notifyAll();
		}
	}
}

public class WaitNotfiyTest {
	public static void main(String[] args) throws InterruptedException{
		MyHouse myHouse = new MyHouse();
		myHouse.eatPizza();
		myHouse.pizzaGuy();
	}
}
