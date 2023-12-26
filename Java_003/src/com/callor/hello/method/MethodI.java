package com.callor.hello.method;

public class MethodI {
	
	public static int isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return 0;
			}
		}// end for
		return num;
	}	
	public static void main(String[] args) {
		
		System.out.println("=".repeat(50));
		System.out.println("소수의 합 구하기");
		System.out.println("-".repeat(50));
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int num = (int)(Math.random()* 100)+ 2;
			int result = isPrime(num);
			sum += isPrime(num);
			if(num > 0) {
				System.out.println(num + "는 소수임");
			}else {
				System.out.println(num + "는 소수가 아님");
			}
		}// end for
		System.out.println("-".repeat(50));
		System.out.println("소수의 합 = "+ sum);
		System.out.println("=".repeat(50));
	}// end main

}
