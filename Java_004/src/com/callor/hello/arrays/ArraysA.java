package com.callor.hello.arrays;

public class ArraysA {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 80;
		int[] nums = new int[num1];
		for(int i = 0; i < nums.length; i++) {
			int rndNum = (int)(Math.random()*50)+ 51;
			nums[i] = rndNum;
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > num2) {
				System.out.printf("index %d 번 요소의 값 : %d\n",i, nums[i]);
				break;
			}
		}
	}

}
