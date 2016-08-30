package sg.com.java.mastercard.roatearray;

import java.util.Arrays;

class RotateArray{
	public void rotate(int[] nums, int k){
		int[] nums2= new int[nums.length];
		System.arraycopy(nums, nums.length-k, nums2, 0, k);
		System.arraycopy(nums, 0, nums2, k, nums.length-k);
		System.out.println(Arrays.toString(nums2));
		//nums=nums2;//It doen't work
		//System.arraycopy(nums2, 0, nums, 0, nums.length);
		
		int[] nums3 = new int[nums.length];
		int j=0;
		for(int i=nums.length-k;i<nums.length; i++){
			nums3[j] = nums[i];
			j++;
		}
		for(int i=0; i<nums.length-k; i++){
			nums3[j] = nums[i];
			j++;
		}
		System.out.println(Arrays.toString(nums3));
		//System.arraycopy(nums3, 0, nums, 0, nums.length);
		
		
		int temp;
		for(int i=0; i<k;i++){
			temp = nums[nums.length-1];
			for(int l=nums.length-1; l>0; l--){
				nums[l]=nums[l-1];
			}
			nums[0]=temp;
		}
		System.out.println(Arrays.toString(nums));
		
	}
}

public class RotateArrayTest {
	public static void main(String[] args){
		RotateArray rotateArray = new RotateArray();
		
		int[] nums= {1,2,3,4,5,6,7};
		rotateArray.rotate(nums, 6);
		System.out.println(Arrays.toString(nums));
	}
}
