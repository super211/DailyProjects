package sg.com.java.ncs.inter;

public class Test7_Thread {

	public static void main(String[] args){
		t1 athread1 = new t1();
		t2 athread2 = new t2();
		athread1.start();
		athread2.start();
		System.out.println("You are in main");
	}

}

class t1 extends Thread{
	public void run(){
		System.out.println("t1");
	}
}

class t2 extends Thread{
	public void run(){
		System.out.println("t2");
	}
}
