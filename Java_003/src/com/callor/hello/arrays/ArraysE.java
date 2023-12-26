package com.callor.hello.arrays;

public class ArraysE {
	
	public static void main(String[] args) {
		
		int num = 0;
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++) {
			int rndNum = (int)(Math.random()* 50)+ 51;
			nums[i] = rndNum;
		}// end for
		for(int i = 0; i < 10; i++) {
			if(nums[i] > 80) {
				System.out.printf("index %d 번 요소의 값 : %d\n ",i,nums[i]);
			}
		}// end for 2
	}//end main

}
