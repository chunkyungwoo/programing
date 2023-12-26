package com.callor.hello.arrays;

public class ArraysF {
	
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int SUBJECT_COUNT = 3;
		
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMaths = new int[STUDENT_LENGTH];
		int[] sums = new int[STUDENT_LENGTH];
		float[] avgs = new float[STUDENT_LENGTH];
		int[] totalSum = new int[SUBJECT_COUNT];
		float[] totalAvg = new float[SUBJECT_COUNT];
		
		for(int i = 0; i < scoreKors.length; i++) {
			scoreKors[i] = (int)(Math.random()*50)+51;
		}// end for
		for(int i = 0; i < scoreEngs.length; i++) {
			scoreEngs[i] = (int)(Math.random()*50)+51;
		}// end for2
		for(int i = 0; i < scoreMaths.length; i++) {
			scoreMaths[i] = (int)(Math.random()*50)+51;
		}// end for3
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sums[i] += scoreKors[i];
			sums[i] += scoreMaths[i];
			sums[i] += scoreEngs[i];
		}// end for4
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			avgs[i] = (float)sums[i] / 3;
		}// end for5
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			totalSum[0] += scoreKors[i];
			totalSum[1] += scoreEngs[i];
			totalSum[2] += scoreMaths[i];
		}// end for6
		for(int i = 0; i < SUBJECT_COUNT; i++) {
			totalAvg[i] = (float)totalSum[i] / STUDENT_LENGTH;
		}// end for7
		System.out.println("=".repeat(50));
		System.out.println("\t샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			System.out.printf("%4d\t",i+1);
			System.out.printf("%4d\t", scoreKors[i]);
			System.out.printf("%4d\t", scoreEngs[i]);
			System.out.printf("%4d\t", scoreMaths[i]);
			System.out.printf("%5d\t",sums[i]);
			System.out.printf("%5.2f\n", avgs[i]);
		} // end for8
		System.out.println("-".repeat(50));
		System.out.print("총점\t");
		
		int totalStsums = 0;
		for(int i = 0; i < SUBJECT_COUNT; i++) {
			System.out.printf("%3d\t", totalSum[i]);
			totalStsums += totalSum[i];
		}// end for9
		System.out.printf("%3d\n",totalStsums);
		System.out.print("평균\t");
		float avgStavg = 0;
		for(int i = 0; i < SUBJECT_COUNT; i++) {
			System.out.printf("%3.0f\t", totalAvg[i]);
			avgStavg += totalAvg[i];
		}// end for 10
		avgStavg /= SUBJECT_COUNT;
		System.out.printf("\t%3.2f\n", avgStavg);
		System.out.println("=".repeat(50));
	}// end main

}
