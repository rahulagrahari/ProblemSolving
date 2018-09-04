package DS2;

import java.util.Arrays;

public class Solution {

//	static int[] counts(int[] nums, int[] maxes) {
//		int[] count = new int[maxes.length];
//		int temp = 0;
//		int counter=0;
//		boolean flag = false;
//		Arrays.sort(nums);
//		for (int f: nums) {
//			System.out.print(f+", ");
//		}
//		
//			for(int j=0; j<maxes.length;j++) {
//				
//				for(int i=temp; i<nums.length; i++) {
//					if (maxes[j]>=nums[i]) {
//						counter++;
//					}
//					else {
//						if(j+1 < maxes.length) {
//						if (maxes[j]<=maxes[j+1]) {
//							temp=i;
//						}
//						}
//						else {
//							temp=0;
//							flag=true;
//						}
//						break;
//					}
//				}
//				count[j]=counter;
//				if(flag)
//					counter=0;
//				flag=true;
//			}
//		
//		return count;
//	}
	

	static int[] counts(int[] nums, int[] maxes) {
		int[] count = new int[maxes.length];
		Arrays.sort(nums);
		for (int f: nums) {
			System.out.print(f+", ");
		}
		System.out.println();
			for(int j=0; j<maxes.length;j++) {
				int counter=0;
				for(int i=0; i<nums.length; i++) {
					if (maxes[j]>=nums[i]) {
						counter++;
					}
					else {
						break;
					}
				}
				count[j]=counter;
			}
		
		return count;
	}	
	
	
	
	public static void main(String[] args) {
		int[] nums = {5,2,10,5,4,8,4,3,1,7,8};
		int[] maxes = {1,0,3,4};
		
//		{5,2,10,5,4,8,4,3,1,7,8}
//		{1,0,3,4}
		int[] a = counts(nums, maxes);
		
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	
}
