package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/*ask user to enter age
		 * if age is from 1 to 3 --> you are a baby
		 * if age is from 3 to 5 -->you are toddler
		 * if age from 5-12 --> you are a kid
		 * is age  from 12-19 --> teenager
		 * if age >20 --> you are an adult
		 */

		
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.print("Enter your age :");
		int age=scan.nextInt();
		
		String human;
		
		if (age>=1 && age<=3) {
			human="Baby";
			//System.out.println("You are a baby");
		}else if (age>3 && age<=5) {
			human="Toddler";
			//System.out.println("You are a toddler");
		}else if (age>5 && age<=12) {
			human="kid";
			//System.out.println("You are a kid");
		}else if (age>12 && age<=19){
			human="Teenager";
			//System.out.println("Teenager");
		}else if (age>=20){
			human="Adult";
			//System.out.println("You are an adult");
		}else {
			human="invalid age";
		//System.out.println("invalid age enter");
		}
		System.out.println("You are " +human);
			
	}

}
