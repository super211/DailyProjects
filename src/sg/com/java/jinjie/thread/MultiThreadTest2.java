package sg.com.java.jinjie.thread;

public class MultiThreadTest2 {
	public static void main(String[] args){
		/*Thread thread1 = new Thread(new NewThread2(), "first");
		Thread thread2 = new Thread(new NewThread2(), "second");*/
		Thread thread1 = new Thread(new NewThread2());
		Thread thread2 = new Thread(new NewThread2());
		thread1.start();
		thread2.start();
	}
	
}

class NewThread2 implements Runnable{
	
	public String toString(){
		return Thread.currentThread().getName();
	}
	
	@Override
	public void run() {
		System.out.println(this);
	}
	
}