package sg.com.java.interv.eye21_printabc.ok;

class PrintThread extends Thread{
	static int count = 0;
	
	public PrintThread(String str){
		this.setName(str);
	}
	
	public void run(){
		while(count<30){
			switch(count%3){
			case 0:
				if("A".equals(getName()))
					printAndIncrease();
				break;
			case 1:
				if("B".equals(getName()))
					printAndIncrease();
				break;
			case 2:
				if("C".equals(getName()))
					printAndIncrease();
				break;

			}
		}
	}
	
	public void printAndIncrease(){
		System.out.println(getName());
		if("C".equals(getName()))
			System.out.println();
		count++;
	}
}

public class MyTest {
	
	public static void main(String[] args){
		new PrintThread("A").start();
		new PrintThread("B").start();
		new PrintThread("C").start();
	}
}
