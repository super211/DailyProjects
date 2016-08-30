package sg.com.java.begin.swap;

public class SwapTest2 {

	//cannot swap the values
	static void swap(int a, int b){
		int t ;
		t = a;
		a = b;
		b = t;
	}
	
	//Method1: Array
	static void swap2(int[] a){
		if(a == null || a.length != 2)
			throw new IllegalArgumentException();
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
		
	public static void main(String[] args){
		int a = 2;
		int b = 3;
		System.out.println("Before Swap: " + "a=" + a + "b=" + b);
		swap(a,b);
		System.out.println("Before Swap: " + "a=" + a + "b=" + b);
		
		int[] c = new int[2];
		c[0] = a;
		c[1] = b;
		System.out.println("Before Swap: " + "c[0]=" + c[0] + "c[1]=" + c[1]);
		swap2(c);
		System.out.println("Before Swap: " + "c[0]=" + c[0] + "c[1]=" + c[1]);
		
	}
}
