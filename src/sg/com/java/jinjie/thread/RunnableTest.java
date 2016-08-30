/*
���ڳ��򿪷���ֻҪ�Ƕ��߳̿϶���Զ��ʵ��Runnable�ӿ�Ϊ������Ϊʵ��Runnable�ӿ����
�����̳�Thread�������ºô���
����->�����̳еľ��ޣ�һ������Լ̳ж���ӿڡ�
����->�ʺ�����Դ�Ĺ���

Other APIs in Java accept work as Runnable and not specializations of the Thread class.
Defining your work as Runnable doesn't wed your work to the Thread object. In the future, you might want to hand your work to some other execution abstraction.
Java doesn't support multiple inheritance, so if your class already extends an object, you can't also extend Thread.
By implementing Runnable, multiple threads can share an instance of your work. If you extended Thread, you'd have to create a new instance of your work for each thread.
 */

package sg.com.java.jinjie.thread;

class MyThread1 implements Runnable{
	
	private int ticket = 10;
	final Thread t;
	
	public MyThread1(){
		t = new Thread(this);
		t.start();
		System.out.println(t.getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++){
			if(this.ticket > 0)
				System.out.println("Selling ticket: " + this.ticket--);
		}
	}
	
}

public class RunnableTest {
	public static void main(String[] args){
		MyThread1 mt = new MyThread1();
		/*MyThread1 mt1 = new MyThread1();
		MyThread1 mt2 = new MyThread1();*/
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}
}
