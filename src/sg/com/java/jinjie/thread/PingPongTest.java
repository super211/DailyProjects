package sg.com.java.jinjie.thread;

public class PingPongTest {
	public static void main(String[] args){
		Thread t = new Thread(){
			public void run(){
				pong();
			}
		};
		
		/*
		 ������Thread����start()��run()�����������ˡ�start()��������һ���̣߳�������start������ϵͳ�ŻῪ��һ���µ��̣߳���������run()������ִ������
		 �������ĵ���run()�͸�������ͨ������һ���ģ��Ѿ�ʧȥ�̵߳������ˡ����������һ���̵߳�ʱ��һ��Ҫʹ��start()������run()��
		 */
		
		t.start();
		//t.run(); 
		System.out.println("ping");
	}
	
	static void pong(){
		System.out.println("pong");
	}
}
