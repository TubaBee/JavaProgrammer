package com.class5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*if user has a credit card or not
		 * if user does not have a credit card then offer them. if they do have one ask
		 *what is balance on the card? if balance of the card is larger then 1000, tell
		 * them to pay off otherwise you can tell them thatthey can spend more
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false");
		boolean cc = input.nextBoolean();

		if (cc) {
			System.out.println("What is the balence on your card?");
			int balance = input.nextInt();
			if (balance > 1000) {
				System.out.println("Please pay off your balance");
			} else {
				System.out.println("You can spend more money");
			}
		} else {
			System.out.println("Would you like to apply for credit card");
		}

	}

}
