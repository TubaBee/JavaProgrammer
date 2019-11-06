package com.class9;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k = 1; k <= 5; k++) {
			for (int l = 1; l <= 5; l++) {
				System.out.println("*"); // 25 times *
			}

		}

		System.out.println(".....................");

		// ****
		// ****
		// ****

		for (int l = 1; l <= 5; l++) {
			System.out.print("*");
		}
		System.out.println();
		for (int l = 1; l <= 5; l++) {
			System.out.print("*");
		}
		System.out.println();
		for (int l = 1; l <= 5; l++) {
			System.out.print("*");
		}

		System.out.println();

		System.out.println("!!!!!!!!!!!  Other tecnic  !!!!!!!!!!!!!!!!!!!!!!!");

		for (int i = 1; i < 4; i++) {
			for (int k = 1; k <= 5; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

		// *******
		// *******
		// *******
		// *******
		// *******

		for (int i = 0; i <= 4; i++) { //rows
			for (int k = 0; k < 7; k++) { //cols
				System.out.print("*");
			}
			System.out.println();
		}
		
		//print
		
		/* 12345
		 * 12345
		 * 12345
		 * 12345
		 */

		for (int i=1; i<5; i++) {
			for (int j=1;j<6; j++) {
				System.out.print(j);
			}System.out.println();
		}
		
		/* 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789 */
		
		
		for (int i=1; i<=5; i++) {
			for (int j=1;j<10; j++) {
				System.out.print(j);
			}System.out.println();
		}
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,");
		
		/* 54321
		 * 54321
		 * 54321
		 * 54321
		 * 54321 */
		
		for (int i=1; i<6; i++){
			for (int a=5; a>0; a--) {
				System.out.print(a);
			}System.out.println();
		}
		System.out.println("---------");
		

		/* 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111 */
		
		for (int k=5; k>=1; k--) {
			
			for (int j=5;j>=1; j--) {
			System.out.print(k);
		}
			System.out.println();
	}
		
		
		
}
}
