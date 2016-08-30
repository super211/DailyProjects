package sg.com.java.testing;

import java.util.Scanner;

public class Solution2 {
	public static void  main(String[] args){
		System.out.println("Please input the numbers of integer:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.println("Please input the integers' value:");
		int[] numbers = new int[number];
		long sum = 0;
		
		Scanner input2 = new Scanner(System.in);
		for(int i=0; i<number; i++){
			numbers[i] = input2.nextInt();
			//sum += numbers[i];
		}
		
		int res;
		res = lonelyInteger(numbers);
		System.out.println(res);
		/*for(int i=0; i< res.length; i++){
			System.out.println(res[i]);
		}*/
	}

	public static int lonelyInteger(int[] arr) {
		int result = 0;

		for (int value : arr) {

			result ^= value;

		}

		return result;
	}
	
	/*public static int[] lonelyInteger(int[] data) {
        int[] result = {0, 0};
        if (data == null || data.length < 2) {
            return result;
        }
        int xor = 0;
        for (int i : data) {
            xor ^= i;
        }
        int indexOf1 = findFirstBit1(xor);
        for (int i : data) {
            if (isBit1(i, indexOf1)) {
                result[0] ^= i;
            } else {
                result[1] ^= i;
            }
        }
        return result;
    }
	
	 private static int findFirstBit1(int num) {
	        int index = 0;
	        while ((num & 1) == 0 && index < 32) {
	            num >>>= 1;
	            index++;
	        }
	        return index;
	    }
	    private static boolean isBit1(int num, int indexBit) {
	        num >>>= indexBit;
	        return (num & 1) == 1;
	    }*/
}
