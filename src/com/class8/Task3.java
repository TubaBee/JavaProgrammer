package com.class8;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 50 expect those that are divisible by 3
		 */

		for (int a = 1; a <= 50; a++) {

			if (a % 3 == 0) {
				continue;
			}
			System.out.print(a + " ");
		}

		/*
		 * Create a program that will be asking user to apply for credit card 10 times.
		 * as soon you get an "yes" from a user program should stop asking.
		 */
		System.out.println(".......Task 2..............");

		String card;
		Scanner scan = new Scanner(System.in);

		for (int c = 1; c <= 10; c++) {
			System.out.println("Are you apply to credit card?");
			card = scan.nextLine();
			if (card.equalsIgnoreCase("yes")) {
				break;
			}

			

			

		}

	}

}
