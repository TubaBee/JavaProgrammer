package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*lest's ask user to enter if it is raining or not
		 * (true or false)
		 * as long as there is rain let's take an umbrella and keep asking
		 * as soon as there is no rain --> you can go to the park
		 */

	
	Scanner scan=new Scanner(System.in);
	boolean isRain;
	
	do {
		System.out.println("Is it raining?");
		isRain=scan.nextBoolean();
		if(isRain) {
			System.out.println("Take an umbrella");
		}
		
	}while(isRain);
	
	System.out.println("You can go to the park");
	
	}

}
