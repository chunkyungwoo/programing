package com.callor.hello.algorithm;

public class LoopK {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		num = 35;
		
		System.out.println("=".repeat(50));
		for(int i =0; i < num; i++) {
			sum += i;
		}// end for
		System.out.printf("1 ~ %d까지 덧셈 결과 : ",num);
		System.out.println(sum);
		System.out.println("=".repeat(50));
	}

}
