package com.callor.hello.method;

public class MethodD {
	
	public static int add() {
		int num1 = 30;
		int num2 = 40;
		int result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
		
		int sum = add();
		System.out.println("return 값 = "+ sum);
		
	}

}
