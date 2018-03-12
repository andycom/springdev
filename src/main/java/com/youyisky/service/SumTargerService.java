package com.youyisky.service;

public class SumTargerService {

	public static void main(String[] args) {

		int[] num = new int[] {3,5,3, 7, 9 };
		int target = 6;
		System.out.print(twoSum(num, target));

	}

	public static int[] twoSum(int[] nums, int target) {
		int key = 0;
		for (int i : nums) {
			for(int k=1+key;k<nums.length;k++) {
				if(i+nums[k]==target) {
					return new int[] {key,k};
				}
			}
			
			key++;
		}
		
		return nums;
	}

}
