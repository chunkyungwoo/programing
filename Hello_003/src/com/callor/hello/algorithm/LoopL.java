package com.callor.hello.algorithm;

public class LoopL {
	
	public static void main(String[] args) {
		int sum = 0;
		 for(int i = 0; i < 100; i++) {
			 if((i + 1 )% 2 == 0) {
				 sum += i + 1;
			 }
		 }// end for
		 System.out.print("1 ~ 100까지 짝수만 덧셈한 수 : ");
		 System.out.println(sum);
	}

}
