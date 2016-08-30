package sg.com.java.ncs.inter;

public class Static {
	static{
		int x = 5;
	}
	
	static int x,y;
	
	public static void main(String[] args){
		System.out.println(x);
		x--;
		System.out.println(x);
		myMethod();
		System.out.println(x);
		System.out.println(x + y + ++x);
	}
	
	public static void myMethod(){
		System.out.println(x);
		y= (x++) + (++x);
		System.out.println(x);
		System.out.println("y:"+y);
	}
}
