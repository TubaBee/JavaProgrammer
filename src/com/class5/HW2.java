package com.class5;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*print whether it is a weekend or weekday
		 * if any day from 1-5--> it is a weekday
		 * anyday from 6-7 --> it is a weekend
		 * any other day --> invalid day */
				
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter day number");
		
		int d =scan.nextInt();
		
		if (d>=1 || d<=5) {
			System.out.println("It is a weekday");
		}else if (d==6 || d==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		System.out.println("..................................");	
		
		//Task 2
		/*Prompt the user to emter person heights in inches. 
		 * Person should be classfield as one of the following;
		 * short (under 5 feet)
		 * medium(5 to 6 feet)
		 * tall (6feet and over)
		 */
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please enter height");
		int p=scan1.nextInt();
		if (p<5) {
			System.out.println("You are Short");
		}else if(p==5 || p==6) {
			System.out.println("You are Medium");
		}else if(p>6) {
			System.out.println("You are Tall");
		}else {
			System.out.println("invalid number");
		}
		
	}

}
