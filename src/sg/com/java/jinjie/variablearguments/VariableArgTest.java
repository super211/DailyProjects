package sg.com.java.jinjie.variablearguments;

public class VariableArgTest {
	public int sum(int... numbers){
		int sum = 0;
		for(int number:numbers){
			sum += number;
		}
		return sum;
	}
	public static void main(String[] args){
		VariableArgTest variableArgTest = new VariableArgTest();
		System.out.println(variableArgTest.sum(1,4,5));
		System.out.println(variableArgTest.sum(1,4,5,20));
		System.out.println(variableArgTest.sum(0));
	}
}
