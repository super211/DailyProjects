package sg.com.java.ncs.inter;

public class Test10_plusplus {
	static int x;
	static boolean catchs(){
		x++;
		return true;
	}
	public static void main(String[] args){
		x = 0;
		if((catchs()|catchs()) || catchs()){
			x++;
			System.out.println(x);
		}
	}
}
