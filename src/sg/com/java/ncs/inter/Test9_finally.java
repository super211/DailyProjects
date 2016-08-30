package sg.com.java.ncs.inter;

public class Test9_finally {
	public static void main(String[] args){
		try{
			System.out.println("hello world");
		}finally{
			System.out.println("Finally executing");
		}
	}
}
