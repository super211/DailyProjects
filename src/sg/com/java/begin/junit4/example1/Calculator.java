package sg.com.java.begin.junit4.example1;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) throws Exception {
		if (0 == b) {
			throw new Exception("��������Ϊ��!");
		}

		return a / b;
	}
	
	public static void main(String[] args){
		int i = 6/0;
	}
}