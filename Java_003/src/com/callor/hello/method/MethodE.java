package com.callor.hello.method;

public class MethodE {
	
	public static int buy() {
		
		int num1 = 2000;
		int num2 = 1500;
		int result = num1 - num2;
		return result;
	}
	
	public static void main(String[] args) {
		
		int num1 = 2000;
		int change = buy();
		System.out.printf("전달한 값 = %d,거스름돈 = %d",num1, change);
	}

}
