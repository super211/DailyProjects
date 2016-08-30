package sg.com.java.testing;

import java.util.HashSet;
import java.util.Set;


class MyThread1 extends Thread{
	public void run(){
		System.out.println("Thread1 is running");
	}
}

class MyThread2 extends Thread{
	public void run(){
		System.out.println("Thread1 is running");
	}
}

class MyThread3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread3 is running");
	}
	
}

class MyThread4 implements Runnable{
	
	int total = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread4 is running");
		synchronized(this){
			for(int i=1; i<100; i++){
				total += i;
			}
			notify();
			System.out.println("The total is: " + total);
		}
	}
	
}

public class HashSetTest {
	public static void main(String[] args) throws InterruptedException{
		String[] strArrayA = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		String[] strArrayB = {"a", "b", "c", "d", "e", "k", "l", "m", "n", "o"};
		
		Set set = new HashSet();
		for(int i=0; i<10; i++){
			set.add(strArrayA[i]);
		}
		
		for(int j=0; j<10; j++){
			if(!set.add(strArrayB[j])){
				System.out.println(strArrayB[j]);
			}
		}
		
		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2();
		thread1.start();
		thread2.start();
		
		MyThread3 thread3 = new MyThread3();
		MyThread4 thread4 = new MyThread4();
		new Thread(thread3).start();
		new Thread(thread4).start();
		
		synchronized(thread4){
			thread4.wait();
		}
		System.out.println("The total is(main): " + thread4.total);
		
		StringBuilder strB = new StringBuilder().append("hello");
		System.out.println(strB);
		
		StringBuffer strBu = new StringBuffer().append("hello");
		System.out.println(strB);
		
	}
}
