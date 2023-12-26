package com.callor.hello.prime;

public class PrimeB {
	
	public static void main(String[] args) {
		
		int num = 15;
		int index = 0;
		
		for(index = 2; index < num; index++) {
			if(num % index == 0) {
				break;
			}
		} // end for
		if(index < num) {
			System.out.printf("%d MOD %d = %d,", num , index, num % index);
			System.out.println(num +" 는 소수가 아님");
		}else {
			System.out.println(num + "는 소수");
		}
	} // end main

}
