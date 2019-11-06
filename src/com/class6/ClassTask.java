package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
	/*ask user to enter the month they were born
	 * based on the month define the season
	 * if user is born in jan feb, dec-->winter
	 * if mar, apr, may --> spring
	 * if jun, jul, aug --> summer 
	 * if sep, oct, nov --> fall
	 * at the end of the program "you were born in _________" */

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your born month first three word ");
		String month;
		month=scan.nextLine();
		String gos = null;
		//gos=scan.nextLine();
		
		if (month.equals("jan") || month.equals("feb") || month.equals("dec")) {
			gos="Winter";
		}else if(month.equals("mar") || month.equals("apr") || month.equals("may")) {
			gos="Spring";
		}else if(month.equals("jun") || month.equals("jul") || month.equals("aug")) {
			gos="Summer";
		}else if(month.equals("sep") || month.equals("oct") || month.equals("nov")) {
		    gos="Fall";
	}
	System.out.println("You were born in "+gos);
	System.out.println("your month is " +month);
	}	
}
