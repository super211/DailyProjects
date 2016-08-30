package sg.com.java.begin.array;

public class ArrayTest2 {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,7,6,9,8};
		
		//arr = null; // it will show: NullPointerException
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("max: " + getMax(arr));
		
		int[] array = bubbleSort(arr);
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static int getMax(int[] array){
		int max = array[0];
		for(int i=0; i<array.length; i++){
			if(max < array[i]){
				max = array[i];
			}
		}
		return max;
	}
	
	public static int[] bubbleSort(int[] array){
		int temp = array[0];
		
		for(int i=0; i<array.length; i++){
			for(int j=i+1; j<array.length; j++){
			    if(array[i] < array[j]){
			    	temp = array[j];
			    	array[j] = array[i];
			    	array[i] = temp;
			    }
			}
		}
		
		/*for(int l=0; l<array.length; l++){
			System.out.println(array[l]);
		}*/
		
		return array;
	}
}
