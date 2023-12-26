package com.callor.hello.algorithm;

public class AlgA {
	
	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < 100; i++) {
			int num = i + 1;
			if(num % 3 == 0) {
				sum1 += num;
			}
			if(num % 5 == 0) {
				sum2 += num;
			}
			
		}// end for
		System.out.print("1 ~ 100까지 숫자중 3의배수의 합 = ");
		System.out.println(sum1);
		System.out.print("1 ~ 100까지 숫자중 5의배수의 합 = ");
		System.out.println(sum2);
		System.out.println("=".repeat(50));
		System.out.println("3의배수의 합과 5의배수의 4칙연산");
		System.out.printf("%d + %d = %d\n", sum1 , sum2 , sum1 + sum2);
		System.out.printf("%d - %d = %d\n", sum1 , sum2 , sum1 - sum2);
		System.out.printf("%d X %d = %d\n", sum1 , sum2 , sum1 * sum2);
		System.out.printf("%d ÷ %d = %d\n", sum1 , sum2 , sum1 / sum2);
		System.out.println("=".repeat(50));
	}

}
