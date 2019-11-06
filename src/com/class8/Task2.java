package com.class8;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * write a code to find the sum of even & odd numbers from range 1 to 20
		 * expecting 2 outputs sumfo 0dd nums=... sum for even nums=...
		 */

		int sumo = 0;

		for (int a = 1; a <= 20; a += 2) {

			sumo = sumo + a;
			System.out.print(a+"..");
			System.out.print(sumo + "-");
		}
		System.out.println();
		System.out.println(sumo);
		
		// 2 way 
		System.out.println("..........2 way.............. ");
		int sumEven=0;
		int sumOdd=0;
		for (int a = 1; a <= 20; a++) {
			if(a%2==0) {
				System.out.println(a);
				sumEven=sumEven+a;
			}else {
				System.out.println(a);
				sumOdd =sumOdd+a;
			}
		}System.out.println("even total"+sumEven);
		System.out.println("odd total"+sumOdd);
		
	
		System.out.println(".........my answer.............. ");
		int sume = 0;

		for (int a = 2; a <= 20; a += 2) {

			sume = sume + a;
			System.out.print(a+"..");
			System.out.print(sume + "-");
		}
		System.out.println();
		System.out.println(sume);
		System.out.println("////////////////////////////////////");
		
	
		
	}

}
