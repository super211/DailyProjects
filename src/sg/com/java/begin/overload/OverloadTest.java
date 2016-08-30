package sg.com.java.begin.overload;

public class OverloadTest {
	public static void main(String[] args){
		int sum1 = 3, sum2 = 4, sum3 = 5;
		
		int total;
		total = add(sum1, sum2);
		System.out.println("total: " + total);
		total = add(sum1, sum2, sum3);
		System.out.println("total: " + total);
		
		double d1 = 2.13, d2 = 3.43;
		System.out.println("double total: " + add(d1, d2));
	}
	
	public static int add(int x, int y){
		return (x+y);
	}
	
	public static int add(int x, int y, int z){
		return (x+y+z);
	}
	
	public static double add(double x, double y){
		return (x+y);
	}
}
