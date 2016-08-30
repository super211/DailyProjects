package sg.com.java.jinjie.inner;

public class X implements Runnable{
	public void run(){
		System.out.println("x.run");
	}
	
	public static void main(String[] args){
		X x = new X();
//		Thread t = new Thread(x, );
		Thread t = new Thread(x, "first");
		t.start();
	}
}
