package com.callor.hello.prime;

public class PrimeH {
	
	public static void main(String[] args) {
		
		System.out.println("=".repeat(50));
		int sum = 0;
		for(int i = 1; i < 100; i++) {
			int num = i + 1;
			int index = 0;
			for(index = 2; index < num; index++) {
				if(num % index == 0) {
					break;
				}
			}// end for2
			if(index >= num) {
				sum += num;
			}
		}// end for
		System.out.printf("2 ~ 100 까지 수 중 소수들의 합 = %d\n", sum);
		System.out.println("=".repeat(50));
	}// end main

}
