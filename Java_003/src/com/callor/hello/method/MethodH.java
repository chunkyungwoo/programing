package com.callor.hello.method;

public class MethodH {
	
	public static int isPrime(int num) {
		
		for(int index = 2; index < num; index++) {
			if(num % index == 0) {
				return index;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		
		System.out.println("=".repeat(50));
		System.out.println("소수 판별하기");
		System.out.println("-".repeat(50));
		for(int i = 0; i < 5; i++) {
			int num = (int)(Math.random()* 100) + 2;
			int index = isPrime(num);
			if(index > 0) {
				System.out.printf("%3d MOD %3d = %3d, ",num,index,num % index);
				System.out.printf("%3d 는 소수가 아님\n",num);
			}else {
				System.out.printf("%3d 는 소수다",num);
			}
		}// end for
	}// end main

}
