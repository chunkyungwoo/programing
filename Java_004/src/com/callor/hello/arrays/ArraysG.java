package com.callor.hello.arrays;

public class ArraysG {
	
	public static void main(String[] args) {
		
		String grade = "";
		int[] scoreKors = new int[10];
		for(int i = 0; i < scoreKors.length; i++) {
			scoreKors[i] = (int)(Math.random()*50)+51;
		}// end for
		System.out.println("=".repeat(20));
		System.out.println("국어\t평점");
		System.out.println("-".repeat(20));
		for(int i = 0; i < scoreKors.length; i++) {
			System.out.printf("%3d\t ",scoreKors[i]);
			if(scoreKors[i] >= 95) grade = "A+";
			else if(scoreKors[i] >= 90) grade = "A";
			else if(scoreKors[i] >= 85) grade = "B+";
			else if(scoreKors[i] >= 80) grade = "B";
			else if(scoreKors[i] >= 75) grade = "C+";
			else if(scoreKors[i] >= 70) grade = "C";
			else if(scoreKors[i] >= 65) grade = "D+";
			else if(scoreKors[i] >= 60) grade = "D";
			else if(scoreKors[i] >= 50) grade = "F";
			System.out.println(grade);
		}// end for2
		System.out.println("=".repeat(20));
	}// end main

}
