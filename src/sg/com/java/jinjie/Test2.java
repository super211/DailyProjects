package sg.com.java.jinjie;

public class Test2 {
	public static void main(String[] args){
		Reservior r = new Reservior(100);
		Booth booth1 = new Booth(r);
		Booth booth2 = new Booth(r);
		Booth booth3 = new Booth(r);
	}
}

class Reservior{
	private int total;
	
	public Reservior(int t){
		this.total = t;
	}
	
	public synchronized boolean sellTicket(){
		if(this.total > 0){
			this.total--;
			return true;
		}else{
			return false;
		}
	}
}

class Booth extends Thread{
	private static int threadID = 0;
	private int count;
	private Reservior r;

	public Booth(Reservior r){
		super("ThreadName: " + threadID++);
		this.r = r;
		this.start();
	}
	
	public void run(){
		while(true){
			if(this.r.sellTicket()){
				this.count++;
				System.out.println(this.getName() + " sell 1 ticket");
			}else{
				break;
			}
		}
		System.out.println(this.getName() + " sold " + this.count);
	}
}
 