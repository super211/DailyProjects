package sg.com.java.interv.eye18_sums_1.ok;

/* http://mouselearnjava.iteye.com/blog/2152420
 * http://thecodesample.com/?p=291
计算非负数二进制形式中1的个数. 
 */

public class MyTest {
	public static void main(String[] args){
		int value = 980;
		int num = 0;
		
		num = Integer.toBinaryString(value).replaceAll("0", "").length();
		System.out.println(num);
		
		num = calOneNumbers(value);
		System.out.println(num);
		
		num = calOneNumbers2(value);
		System.out.println(num);
	}
	
	public static int calOneNumbers(int value){
		int count = 0;
		int temp = 0;
		count = value==0?0:1;
		while((temp = value/2)>0){
			if(value%2 == 1){
				count++;
			}
			value = temp;
		}
		return count;
	}
	
	public static int calOneNumbers2(int value){
		int count = 0;
		count = value==0?0:1;
		while((value=value&(value-1))>0){
			count++;
		}
		return count;
	}
}
