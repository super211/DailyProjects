/*
　在程序开发中只要是多线程肯定永远以实现Runnable接口为主，因为实现Runnable接口相比
　　继承Thread类有如下好处：
　　->避免点继承的局限，一个类可以继承多个接口。
　　->适合于资源的共享

Other APIs in Java accept work as Runnable and not specializations of the Thread class.
Defining your work as Runnable doesn't wed your work to the Thread object. In the future, you might want to hand your work to some other execution abstraction.
Java doesn't support multiple inheritance, so if your class already extends an object, you can't also extend Thread.
By implementing Runnable, multiple threads can share an instance of your work. If you extended Thread, you'd have to create a new instance of your work for each thread.
 */

package sg.com.java.jinjie.thread;

class MyThread extends Thread{
	private int ticket = 10;
	
	public void run(){
		for(int i=0; i<10; i++){
			if(this.ticket > 0){
				System.out.println("Selling ticket: " + this.ticket--);
			}
		}
	}
}

public class ThreadTest {
	public static void main(String[] args){
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		MyThread m3 = new MyThread();
		m1.start();
		m2.start();
		m3.start();
	}
}
