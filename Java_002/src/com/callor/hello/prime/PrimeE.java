package com.callor.hello.prime;

public class PrimeE {
	
	public static void main(String[] args) {
		
		System.out.println("=".repeat(50));
		System.out.println("소수 판별하기");
		System.out.println("-".repeat(50));
		
		for(int i =0; i < 5; i++) {		
		int num = (int)(Math.random()* 100)+ 1;
		int index = 0;		
		for(index = 2; index < num; index++) {
			if(num % index == 0) {
				break;
			}
		} // end for2
		if(index < num) {
			System.out.printf("%3d MOD %3d = %3d ,",num,index,num % index);
			System.out.printf("%3d 는 소수가 아님\n",num);
		}else {
			System.out.printf("%3d 는 소수임\n",num);
		}
		}// end for
		System.out.println("=".repeat(50));
	}// end main

}
