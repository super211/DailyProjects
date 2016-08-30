package sg.com.java.jinjie.thread;



public class MultiThreadTest {

	public static void main(String[] args) {
		NewThread thread1 = new NewThread();
		NewThread thread2 = new NewThread();
		
		//use start will initialise a new thread, so the sequence is not certain
		/*thread1.start();
		thread2.start();*/
		
		//The sequence will be certain
		thread1.run();
		thread2.run();
		System.out.println(thread1.toString());
		System.out.println(thread2.toString());
	}

}

class NewThread extends Thread{
	private static int threadID = 0;
	
	public NewThread(){
		super("ThreadName:" + (++threadID));
	}
	
	public String toString(){
		//System.out.println(super.getName());
		return super.getName();
	}
	
	public void run(){
		System.out.println(this);
	}
}