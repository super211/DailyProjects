package sg.com.java.recursion;

public class RecursionSum {
	public static void main(String[] args){
		int num = 10;
		System.out.println("total: " + getSum(num));
	}
	
	public static int getSum(int n){
		if(n==1)
			return 1;
		else
			return (n+getSum(n-1));
	}
}
