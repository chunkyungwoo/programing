package com.callor.hello.var;

public class VarA {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		float num3 = 0;
		float num4 = 0;
		
		num1 = 30;
		num2 = 40;
		num3 = 30.2f;
		num4 = 40.3f;
		
		System.out.println("30 + 40 = "+ (num1 + num2));
		System.out.println("30 - 40 = "+ (num1 - num2));
		System.out.println("30 X 40 = "+ (num1 * num2));
		System.out.println("30 ÷ 40 = "+ (num1 / num2));
		System.out.println("=".repeat(20));
		System.out.println("30.2 + 40.3 = "+(num3 + num4));
		System.out.println("30.2 - 40.3 = "+(num3 - num4));
		System.out.println("30.2 X 40.3 = "+(num3 * num4));
		System.out.println("30.2 ÷ 40.3 = "+(num3 / num4));
	}

}
