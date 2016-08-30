package sg.com.nets.puzzlers;

import java.math.BigDecimal;

public class puzzler2_Change {
	public static void main(String[] args){
		System.out.println(2.00 - 1.10);//0.8999999999999999
		System.out.printf("%.2f%n", 2.00 - 1.10); //bad solution
		System.out.println(new BigDecimal(.1)); //0.1000000000000000055511151231257827021181583404541015625
		System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.10"))); // 
	}
}
