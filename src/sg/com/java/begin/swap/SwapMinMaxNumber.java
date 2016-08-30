package sg.com.java.begin.swap;

import java.util.Scanner;

public class SwapMinMaxNumber {
	public static void main(String[] args){
		
		int maxIndex = 0;
		int minIndex = 0;
		int[] numbers = new int[10];
		
		Scanner input = new Scanner(System.in);
		for(int i=0; i<10; i++){
			numbers[i] = input.nextInt();
		}
		
		int temp = 0;
		int max = numbers[0];
		int min = numbers[0];
		
		for(int j=0; j<10; j++){
			if(numbers[j] > max){
				max = numbers[j];
				maxIndex = j;
			}
			
			if(numbers[j] < min){
				min = numbers[j];
				minIndex = j;
			}
		}
		
		for(int a:numbers){
			System.out.print(a + "\t");
		}
		
		System.out.println("");
		
		//Method1-Directy swap: because numbers[i] is not a pointer, cannot change the address
		/*temp = numbers[maxIndex];
		numbers[maxIndex] = numbers[minIndex];
		numbers[minIndex] = temp;*/
		
		//Method2-Use Array
		//swap(numbers, maxIndex, minIndex);
		
		//Method3:Use Object
		Swap swap = new Swap();
		swap.a = numbers[maxIndex];
		swap.b = numbers[minIndex];
		swap.swap();
		numbers[maxIndex] = swap.a;
		numbers[minIndex] = swap.b;		
	
		for(int a:numbers){
			System.out.print(a + "\t");
		}
	}
	
	/*
	����2��
	ͨ�����鷽ʽ������
	*/
	public static void swap(int[] numbers, int maxIndex, int minIndex){
		int temp = numbers[maxIndex];
		numbers[maxIndex] = numbers[minIndex];
		numbers[minIndex] = temp;
	}
	
}

/*
������󣬽�a��b��Ϊ��������ԣ�Ȼ�������������ö�Ӧ�����ԡ�
 */
class Swap{
	public int a;
	public int b;
	
	public void swap(){
		int temp = a;
		a = b;
		b = temp;
	}
}