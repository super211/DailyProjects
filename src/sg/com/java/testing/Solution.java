package sg.com.java.testing;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		
		for(int i=number-1; i>=0; i--){
			sb = multipleSpaces(i);
			sb1 = multipleSign(number-i);
			//System.out.println(sb1);
			sb2 = sb.append(sb1);
			System.out.println(sb2.toString());
		}
	}
	
	public static StringBuffer multipleSpaces(int n){
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<n; i++){
			sb.append(" ");
		}
		return sb;
	}
	
	public static StringBuffer multipleSign(int n){
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<n; i++){
			sb.append("#");
		}
		return sb;
	}
}
/*public String multipleSpaces(int n){
		   String output = "";
		 
		   for(int i=0; i<n; i++)
		      output += " ";
		 
		   return output;
		}*/