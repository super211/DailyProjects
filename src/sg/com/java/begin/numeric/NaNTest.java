package sg.com.java.begin.numeric;

public class NaNTest {
	public static void main(String[] args){
		if(Double.NaN > Float.NaN || Double.NaN <=Float.NaN){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
		System.out.println(Double.NaN);
		System.out.println(Float.NaN);
	}
}
