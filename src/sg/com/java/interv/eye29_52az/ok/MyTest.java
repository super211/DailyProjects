package sg.com.java.interv.eye29_52az.ok;


class PrintThread extends Thread{
	static int count = 0;
	
	public PrintThread(String str){
		this.setName(str);
	}
	
	public void run(){
		while(count<52){
			switch(count%2){
			case 0:
				if("A".equals(getName()))
					printAndIncrease();
				break;
			case 1:
				if("B".equals(getName()))
					printAndIncrease();
				break;
			/*case 2:
				if("C".equals(getName()))
					printAndIncrease();
				break;*/

			}
		}
	}
	
	public void printAndIncrease(){
		if("A".equals(getName())){
			System.out.println(count+1);
			System.out.println(count+2);
		}else{
			System.out.println((char)(getName().charAt(0)+count/2-1));
		}
		if("B".equals(getName()))
			System.out.println();
		count++;
	}
}

public class MyTest {
	
	public static void main(String[] args){
		new PrintThread("A").start();
		new PrintThread("B").start();
		
		//new PrintThread("C").start();
		/*System.out.println(Integer.valueOf('A'));
		System.out.println(String.valueOf(65));*/
	}
}
