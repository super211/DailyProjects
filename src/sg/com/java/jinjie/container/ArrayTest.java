package sg.com.java.jinjie.container;

public class ArrayTest {
	public static void main(String[] args){
		int[] aFrom = {1,2,3,4,5};
		int[] aTo = new int[3];
		System.arraycopy(aFrom, 1, aTo, 0, 3);
		for(int i=0; i<3; i++)
			System.out.println(aTo[i]);
	}
}
