package com.callor.hello.algorithm;

public class AlgF {
	
	public static void main(String[] args) {
		
		int pay = 0;
		pay = 3587960;
		
		System.out.println("=".repeat(30));
		System.out.println(" 5만원권 : " + pay / 50000 );
		pay = pay % 50000;
		System.out.println(" 1만원권 : " + pay / 10000);
		pay = pay % 10000;
		System.out.println(" 5천원권 : " + pay / 5000);
		pay = pay % 5000;
		System.out.println(" 1천원권 : " + pay / 1000);
		pay = pay % 1000;
		System.out.println(" 5백원권 : " + pay / 500);
		pay = pay % 500;
		System.out.println(" 1백원권 : " + pay / 100);
		pay = pay % 100;
		System.out.println(" 5십원권 : " + pay / 50);
		pay = pay % 50;
		System.out.println(" 1십원권 : " + pay / 10);
		System.out.println("=".repeat(30));
	}

}
