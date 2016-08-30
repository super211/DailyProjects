package sg.com.java.jinjie.thread.ok;

/*
1) 该例完成2种方式实现线程:继承Thread和实现Runnable接口

 */

class MyThread1 extends Thread{
	public void run(){
		System.out.println("Thread1 is running");
	}
}

class MyThread2 extends Thread{
	public void run(){
		System.out.println("Thread2 is running");
	}
}

class MyThread3 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread3 is running");
	}	
}

class MyThread4 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread4 is running");
	}	
}

class MyThread5{
	public void run(){
		System.out.println("Thread5 is running");
	}
}

public class TypicalSampleTest {
	public static void main(String[] args){
		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2();
		MyThread3 thread3 = new MyThread3();
		MyThread4 thread4 = new MyThread4();
		MyThread5 thread5 = new MyThread5();
		
		thread1.start();
		thread2.start();
		new Thread(thread1).start();
		new Thread(thread1).start();
		new Thread((Runnable) thread5).start();
	
	}
}
