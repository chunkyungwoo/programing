package com.callor.hello.algorithm;

public class LoopF {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			System.out.printf("%3d ", i+1);
			if((i+1) % 10 == 0) {
				System.out.println();
			}
		}
	}

}
