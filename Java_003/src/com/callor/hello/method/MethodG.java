package com.callor.hello.method;

public class MethodG {
	
	public static boolean isPrime(int num) {
		
		int index = 0;
		boolean isPrime = true;
		for(index = 2; index < num; index++) {
			if(num % index == 0) {
				isPrime = false;
				break;
			}
		}// end for
		return isPrime;
	}	
	public static void main(String[] args) {
		
		System.out.println("=".repeat(50));
		System.out.println("소수판별하기");
		System.out.println("-".repeat(50));
		for(int i = 0; i <5; i++) {			
		int num =(int)(Math.random()* 100)+2;
		boolean isPrime = isPrime(num);
		if(isPrime) {
			System.out.println(num +"는 소수임");
		}else {
			System.out.println(num + "는 소수가 아님");
		}
		}// end for
		System.out.println("=".repeat(50));
	}// end main

}
