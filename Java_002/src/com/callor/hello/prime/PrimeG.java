package com.callor.hello.prime;

public class PrimeG {
	
	public static void main(String[] args) {
		
		System.out.println("=".repeat(50));
		System.out.println("2 ~ 100까지 수 중 소수만 출력하기");
		System.out.println("-".repeat(50));
		
		for(int i = 1; i <100; i++) {
			int num = i + 1;
			int index = 0;
			for(index = 2; index < num; index++) {
				if(num % index == 0) {
					break;
				}
			} // end for 2
			if(index < num) {			
			}else {
				System.out.printf("%3d 는 소수임\n", num);
			}
		} // end for
	} // end main

}
