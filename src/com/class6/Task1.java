package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * ask user to enter boolean value for sale if no sale --> I am not shopping if
		 * sale --> check the price of the item based on the amounth we will have to
		 * calculate the price of discount if price < 20 -->apply 10% if price between
		 * 20-100 --> 20% if between 100-500 --> 30% anything --> 50%
		 * 
		 * After discount ____ the price of the item reduce from ____ to ___
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you any item sale true or false ");
		boolean sale = scan.nextBoolean();
		double fsonuc, sonuc, price;
		sonuc = 0;
		if (!sale) {
			System.out.println("I am not Shopping");
		} else {
			System.out.println("What is the actuacl price?");
			price = scan.nextDouble();
			if (price < 20) {
				sonuc = (price * 10) / 100;
			} else if (price >= 20 || price < 100) {
				sonuc = (price * 20) / 100;
			} else if (price >= 100 || price < 500) {
				sonuc = (price * 30) / 100;
			} else if (price >= 500) {
				sonuc = (price * 50) / 100;
			}
			fsonuc = price - sonuc;
			System.out.println(
					"After discount "  + sonuc + " the price of the item reduce from "+price + " to " + fsonuc);
		}

	}

}
