package sg.com.java.testing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) throws IOException{
	    Scanner in = new Scanner(System.in);
	    //final String fileName = System.getenv("OUTPUT_PATH");
	    //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	    long res;
	    
	    int _arr_size = Integer.parseInt(in.nextLine());
	    int[] _arr = new int[_arr_size];
	    int _arr_item;
	    for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
	        _arr_item = Integer.parseInt(in.nextLine());
	        _arr[_arr_i] = _arr_item;
	    }
	    
	    res = sumOfIntegers(_arr);
	    //bw.write(String.valueOf(res));
	    //bw.newLine();
	    
	    //bw.close();
	    System.out.println(res);
	}
	
	
	static long sumOfIntegers(int[] arr) {
		long sum = 0;
		for (int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum;
    }
	
	public static int countUneatenLeaves(int N, int[] A) {
	    ArrayList<Integer> uneatenLeaves = new ArrayList<Integer>();
	    ArrayList<Integer> eatenLeaves = new ArrayList<Integer>();
	    for (int i = 1; i <= N; i++) {
	        uneatenLeaves.add(i);
	    }
	    // 1. find the multiple of the eatenLeaves
	    for (int i = 0; i < A.length; i++) {
	        eatenLeaves.add(A[i]);
	        for (int j = 1; j < uneatenLeaves.size(); j++) {
	            if (A[i] * uneatenLeaves.get(j) <= N) {
	                eatenLeaves.add(A[i] * uneatenLeaves.get(j));
	            }
	        }
	    }
	    for (int i = 0; i < eatenLeaves.size(); i++) {
	        for (int j = 1; j < uneatenLeaves.size(); j++) {
	            if (eatenLeaves.get(i) == uneatenLeaves.get(j)) {
	                uneatenLeaves.remove(uneatenLeaves.get(j));
	            }
	        }
	    }
	    System.out.println(uneatenLeaves.size());
	    return uneatenLeaves.size();
	}
}


/*
private static int lcm(int a, int b)
{
    return a * (b / findGCD (a, b));
}

private static int findGCD(int number1, int number2) {
//base case
    if(number2 == 0)
    {
        return number1;
    }

    return findGCD(number2, number1%number2);
}*/