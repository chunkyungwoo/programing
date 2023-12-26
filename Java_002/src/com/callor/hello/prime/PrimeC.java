package com.callor.hello.prime;

public class PrimeC {
	
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 9;
		int index = 0;
		
		System.out.println("=".repeat(50));
		System.out.println("7는 Prime Number인가?");
		System.out.println("-".repeat(50));
		for(index = 2; index < num1; index++) {
			if(num1 % index == 0) {
				break;
			}
		} // end for
		if(index < num1) {
			System.out.printf("%d MOD %d = %d,", num1 , index, num1 % index);
			System.out.println(num1 +" 는 소수가 아님");
		}else {
			System.out.println(num1 + "는 소수");
		}
		System.out.println("=".repeat(50));
		System.out.println("9는 Prime Number인가?");
		System.out.println("-".repeat(50));
		for(index = 2; index < num2; index++) {
			if(num2 % index == 0) {
				break;
			}
			if(index < num2) {
				System.out.printf("%d MOD %d = %d,", num2 , index, num2 % index);
				System.out.println(num2 +" 는 소수가 아님");
			}else {
				System.out.println(num2 + "는 소수");
			}
		}// end for2
		System.out.println("=".repeat(50));
	} // end main

}
