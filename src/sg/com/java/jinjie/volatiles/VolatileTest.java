/*
 read and load �����渴�Ʊ�������ǰ�����ڴ�
use and assign  ִ�д��룬�ı乲�����ֵ 
store and write �ù����ڴ�����ˢ�������������

����use and assign ���Զ�γ���

������һЩ����������ԭ���ԣ�Ҳ���� ��read load֮��������ڴ�count���������޸�֮���̹߳����ڴ��е�ֵ�����Ѿ����أ����������Ӧ�ı仯�����Լ�������Ľ�����Ԥ�ڲ�һ��

����volatile���εı�����jvm�����ֻ�Ǳ�֤�����ڴ���ص��̹߳����ڴ��ֵ�����µ�

��������߳�1���߳�2 �ڽ���read,load �����У��������ڴ���count��ֵ����5����ô�������������µ�ֵ

���߳�1��count�����޸�֮�󣬻�write�����ڴ��У����ڴ��е�count�����ͻ��Ϊ6

�߳�2�����Ѿ�����read,load�������ڽ�������֮��Ҳ��������ڴ�count�ı���ֵΪ6

���������̼߳�ʱ��volatile�ؼ����޸�֮�󣬻��ǻ���ڲ����������

volatile��֤�ڴ�ɼ���������֤���⡣�������ڴ�ɼ����л��⡣  �򵥵����volatile��ÿ���߳�ȥ���ʵ�ʱ�򶼻�ǿ�ƴ����������ֵ����������̲��ǻ���ģ�
���ڸĵ�ʱ�����߳�Ҳ���Է��ʡ� ��������벻����ʲôʱ����õ�volatile�ؼ��֣������ü������ܱ�֤�̰߳�ȫ�ġ�  volatile�Ͳ����������̰߳�ȫ�Ĺ��ߡ� 
ֻ�Ǳ�֤�ڴ�ɼ����ѡ�������һ���߳�����flag = false, ��ϣ����һ���߳��´���������false, �ǾͲ���Ҫ��������volatile 

һ���߳�д����һ���̶߳�����volatile�������̶߳�Ҫ��д������
�������Ƽȿ��Ա�֤�ɼ����ֿ��Ա�֤ԭ���ԣ���volatile����ֻ�ܱ�֤�ɼ��ԡ�
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
	
	//����취������
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
