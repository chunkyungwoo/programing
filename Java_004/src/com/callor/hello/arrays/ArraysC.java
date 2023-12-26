package com.callor.hello.arrays;

public class ArraysC {
	
	public static void main(String[] args) {
		
		int STUDENT_LENGTH = 10;
		int sum = 0;
		float avg = 0;
		int[] scoreKors = new int[STUDENT_LENGTH];
		
		for(int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int)(Math.random()*50)+ 51;
			scoreKors[i] = rndScore;
		}// end for
		for(int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
		}// end for2
		avg += (float)sum / scoreKors.length;
		System.out.println("=".repeat(50));
		System.out.println(" 샛별반 국어 점수");
		System.out.println("-".repeat(50));
		for(int i = 0; i < scoreKors.length; i++) {
			System.out.printf("%3d : %3d\n ",i + 1,scoreKors[i]);
		}// end for3
			System.out.println("-".repeat(50));
			System.out.printf(" 총점 : %d , 평균 : %5.2f", sum , avg);
	}// end main

}
