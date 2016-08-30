package sg.com.nets.puzzlers;

public class puzzler1_Odd {
	public static void main(String[] args){
		System.out.println(isOdd(-5));
		System.out.println(isEqual(7, -3));
		
		System.out.println(-1%2);
	}
	
	public static boolean isOdd(int i){
		return (i&1) != 0; // the performance is better
		//return i%2 != 0;
		//return i%2 == 1; //because if is negative, the return 
	}
	
	public static boolean isEqual(int a, int b){
		return (a/b) * b + (a%b) == a;
	}
}
