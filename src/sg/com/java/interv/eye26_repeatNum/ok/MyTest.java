package sg.com.java.interv.eye26_repeatNum.ok;


/* http://mouselearnjava.iteye.com/blog/2152420
http://thecodesample.com/?p=499
一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
 */


import java.util.Arrays;

import sg.com.java.interv.eye26_repeatNum.FindTwoNoRepeatNumbers;

public class MyTest {
	
	public static int xorWholeArray(int[] array){
		int xorResult=0;
		for(int val:array){
			xorResult^=val;
		}
		System.out.println(xorResult);
		return xorResult;
	}
	
	public static int findResultPosition(int xorResult){
		int position=0;
		while((xorResult&1)==0){
			xorResult >>= 1;
			position++;
		}
		System.out.println(position);
		return position;		
	}
	
	public static int[] findTwoElements(int[] array, int position){
		int[] resultArray = null;
		int num1=0, num2=0;
		for(int val:array){
			if((((val>>position)&1))==1){
				num1^=val;
			}else{
				num2^=val;
			}
		}
		
		resultArray=new int[]{num1, num2};
		
		return resultArray;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 1, 3, 3, 1, 5, 9 };
		int xorResult = xorWholeArray(array);
		int position = findResultPosition(xorResult);
		int[] result = findTwoElements(array,position);
		System.out.println(Arrays.toString(result));
	}
}
