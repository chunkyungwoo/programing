package com.callor.hello.prime;

public class PrimeD {
	
	public static void main(String[] args) {
		
		int index = 0;
		int num = (int)(Math.random() * 10) +1;
		for(index = 2; index < num; index++) {
			if(num % index == 0) {
				break;
			}else if(index < num) {
				System.out.printf("%3d MOD %3d = %3d",num , index, num % index);
				System.out.printf("%3d 는 소수가 아님",num);
			}else {
				System.out.printf("%3d 는 소수임\n",num);
			}
		}
	}

}
