package sg.com.java.recursion;

/*it will exceed the capacity of long*/
public class RecursionMultiple {
	public static void main(String[] args){
		long num = 10;
		System.out.println("Total: " + getMultiple(20));
	}
	
	public static long getMultiple(long n){
		if(n==1){
			return n;
		}else{
			return n*getMultiple(n-1);
		}
	}
}
