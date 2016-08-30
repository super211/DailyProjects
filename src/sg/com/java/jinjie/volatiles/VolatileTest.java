/*
 read and load 从主存复制变量到当前工作内存
use and assign  执行代码，改变共享变量值 
store and write 用工作内存数据刷新主存相关内容

其中use and assign 可以多次出现

但是这一些操作并不是原子性，也就是 在read load之后，如果主内存count变量发生修改之后，线程工作内存中的值由于已经加载，不会产生对应的变化，所以计算出来的结果会和预期不一样

对于volatile修饰的变量，jvm虚拟机只是保证从主内存加载到线程工作内存的值是最新的

例如假如线程1，线程2 在进行read,load 操作中，发现主内存中count的值都是5，那么都会加载这个最新的值

在线程1堆count进行修改之后，会write到主内存中，主内存中的count变量就会变为6

线程2由于已经进行read,load操作，在进行运算之后，也会更新主内存count的变量值为6

导致两个线程及时用volatile关键字修改之后，还是会存在并发的情况。

volatile保证内存可见，但不保证互斥。锁即有内存可见又有互斥。  简单的理解volatile，每个线程去访问的时候都会强制从主存里读新值，但这个过程不是互斥的，
你在改的时候别的线程也可以访问。 “真的是想不出来什么时候会用到volatile关键字，而不用加锁就能保证线程安全的”  volatile就不是用来做线程安全的工具。 
只是保证内存可见而已。比如你一个线程设置flag = false, 你希望另一个线程下次来读的是false, 那就不需要用锁，用volatile 

一个线程写，另一个线程读，用volatile！两个线程都要读写，用锁
加锁机制既可以保证可见性又可以保证原子性，而volatile变量只能保证可见性。
 */



package sg.com.java.jinjie.volatiles;

interface Engine{
	 int i = 0;
	public static void testMethod(){
		System.out.println("hello,");
	}
}
abstract class Car{
	static void drive(){
		
	}
}

public class VolatileTest {

	public volatile static int count = 0;
	
	public static void inc(){
		try{
			Thread.sleep(1);
		}catch(InterruptedException e){
			
		}
		count ++;
	}
	
	//解决办法：加锁
/*	public static int count = 0;
	
	public synchronized static void inc(){
		count ++;
	}*/
	
	public static void main(String[] args){
		for(int i=0; i<1000; i++){
			new Thread(new Runnable(){

				@Override
				public void run() {
					VolatileTest.inc();
				}
				
			}).start();
		}
		
		System.out.println("Result: " + VolatileTest.count);
		
		int x=10, y=10;
		System.out.println(x-- + " " + --y);
	}
}
