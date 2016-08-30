package sg.com.java.flextrade.test;

public class ToNumberTest {
	
	public static void main(String[] args){
		String str = "hello";
		int i = toNumber(str);
		System.out.println(i);
	}

	public static int toNumber(String Input) {

		boolean canBeConverted = false;
		int n = 0;
		try {
			n = Integer.parseInt(Input);
			canBeConverted = true;
		}catch (Exception ex) {

		}

		if (canBeConverted == true) {
			return n;
		} else {
			return 0;
		}
	}
}
