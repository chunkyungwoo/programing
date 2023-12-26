package com.callor.hello.arrays;

public class ArraysA {
	
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()* 50)+ 51;
		int num2 = (int)(Math.random()* 50)+ 51;
		int num3 = (int)(Math.random()* 50)+ 51;
		int num4 = (int)(Math.random()* 50)+ 51;
		int num5 = (int)(Math.random()* 50)+ 51;
		int index = 1;
		int sum = num1 + num2 + num3 + num4 +num5;
		System.out.println("=".repeat(50));
		System.out.printf("%d 번쨰 값 : %d\n",index++,num1);
		System.out.printf("%d 번쨰 값 : %d\n",index++,num2);
		System.out.printf("%d 번쨰 값 : %d\n",index++,num3);
		System.out.printf("%d 번쨰 값 : %d\n",index++,num4);
		System.out.printf("%d 번쨰 값 : %d\n",index++,num5);
		System.out.println("-".repeat(50));
		System.out.println("합산결과 : "+ sum);
	}

}
