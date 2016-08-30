package sg.com.java.jinjie.thread;

class MyThreads extends Thread{
	static boolean myCondition = false;
	
    public void run(){
       while(true){
          threadCondWait();// Circle waiting...
       }
    }
    
    public synchronized void threadCondWait() {
      
		while(myCondition){
          try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Comminucate with notify()
       }
    }

}

class MyAnotherThread extends Thread{
	static boolean myCondition = false;
	
    public void run(){
       //Bla Bla bla
    	threadCondNotify();//Trigger wait() Next Step
    }

    public synchronized void threadCondNotify() {
        
		while(myCondition){
          notify();
       }
    }
}

public class WaitNotifyTest2 {
	public static void main(String[] args) throws InterruptedException{
		MyThreads myThreads = new MyThreads();
		MyAnotherThread myAnotherThread = new MyAnotherThread();
		myThreads.start();
		myAnotherThread.start();
		Thread.sleep(2000);
		myAnotherThread.myCondition = true;
	}
}
