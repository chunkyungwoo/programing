package com.callor.hello.arrays;

public class ArraysB {
	
	public static void main(String[] args) {
		
		int STUDENT_LENGTH = 10;
		int sum = 0;
		float avg = 0;
		int[] scoreKor = new int[STUDENT_LENGTH];
		
		for(int i = 0; i < scoreKor.length; i++) {
			int rndScore = (int)(Math.random()*50)+ 51;
			scoreKor[i] = rndScore;
		}// end for
		for(int i = 0; i < scoreKor.length; i++) {
			sum += scoreKor[i];
		}// end for2
		avg = (float)sum / scoreKor.length;
		System.out.println("=".repeat(50));
		System.out.printf("국어 점수 총점 : %d, 평균 %.2f\n",sum,avg);
		System.out.println("=".repeat(50));
	}// end main

}
