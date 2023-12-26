package com.callor.hello.arrays;

public class ArraysD {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++) {
			nums[i] = (int)(Math.random()* 50)+ 51;
		}// end for
		for(int i = 0; i < 10; i++) {
			if(nums[i]% 2 == 0) {
				System.out.printf("%d 번 요소의 값 : %d\n",i,nums[i]);
			}
		}// end for2
		for(int i = 0; i < 10; i++) {
			if(nums[i] % 2 == 0) {
				sum += nums[i];
			}
		}// end for3
		System.out.printf("짝수들의 합 : %d",sum);
	}// end main

}
