package com.class7;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a boolean variable workDay and assign true create int variable day and
		 * assign it to 1
		 * As long as it 
		 * 
		 */

		boolean workDay = true;
		int day = 1;

		while (workDay == true) {

			if (day == 6) {
				System.out.println("I do not need a day off any more");
				workDay = false;
			} else {
				System.out.println("I need a day off");
			}
			day++;
		}
	}
}
