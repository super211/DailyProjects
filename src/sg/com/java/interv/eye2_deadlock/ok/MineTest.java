package sg.com.java.interv.eye2_deadlock.ok;

/*http://mouselearnjava.iteye.com/blog/2152420
 http://thecodesample.com/?p=710
 实现两个线程陷入死锁的情况
 */

class MyThread1 implements Runnable {
	private String str1;
	private String str2;

	public MyThread1(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (str1) {
				synchronized (str2) {
					System.out.println("Thread1 have [" + str1 + "], needs ["+str2+"]");
				}
			}
		}
	}

}

class MyThread2 implements Runnable {
	private String str1;
	private String str2;

	public MyThread2(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (str2) {
				synchronized (str1) {
					System.out.println("Thread2 have [" + str2 + "], needs ["+str1+"]");
				}
			}
		}
	}

}

public class MineTest {
	/*
	 * static { String resource1 = "Resource 1"; String resource2 =
	 * "Resource 2"; }
	 */

	public static void main(String[] args) {
		String resource1 = "Resource 1";
		String resource2 = "Resource 2";
		MyThread1 myThread1 = new MyThread1(resource1, resource2);
		MyThread2 myThread2 = new MyThread2(resource1, resource2);
		new Thread(myThread1, "Thread1").start();
		new Thread(myThread2, "Thread2").start();

	}
}
