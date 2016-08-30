package sg.com.java.interv.assertion;

public class AssertionTest {
	public static void main(String[] args){
		int result = computeSimpleInterest(-1, 0.5f, 5);
		System.out.println(result);
	}
	
	private static int computeSimpleInterest(int principal, float interest, int years){
		assert(principal>0);
		return 100;
	}
}
