package com.callor.hello.var;

public class VarC {
	
	public static void main(String[] args) {
		
		int scoreKor = 0;
		int scoreMath = 0;
		int scoreEng = 0;
		int total = 0;
		int avg = 0;
		
		scoreKor = 80;
		scoreMath = 90;
		scoreEng = 70;
		total = scoreKor + scoreMath + scoreEng;
		avg = total / 3;
		
		System.out.println("=".repeat(30));
		System.out.println("국어 : "+ scoreKor);
		System.out.println("영어 : "+ scoreEng);
		System.out.println("수학 : "+ scoreMath);
		System.out.println("-".repeat(30));
		System.out.println("총점 : "+ total);
		System.out.println("평균 : 0"+ avg);
		System.out.println("=".repeat(30));
	}

}
