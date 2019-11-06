package com.class4;

import java.util.Scanner;

public class odevDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("What is the amound of loan is needed? ");

		Scanner keyboard = null;
		int loann=keyboard.nextInt();
		if (loann<200000){
			System.out.println("I would lend the money");
		}else{
			System.out.println("Sorry your work is done");
		}
		}
		//.............................................
		//task 2
	
	public static void main1(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("How old are you");
		Scanner keyboard = null;
		int age=keyboard.nextInt();

		if (age>=18){
			System.out.println("You will issue driver licience to them");
		}else{
			System.out.println("You will offr them to get a learner");
		}
		
}//.................................................
		//Task 3
	
	public static void main2(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String city=scan.nextLine();
		System.out.println("What is your city "+city);
		

		System.out.println("Entered temprature is ");
		int temp=scan.nextInt();

		int convertedTemp=(temp-32)*5/9;

		System.out.println("The temprature is city"+city +"is "+convertedTemp);
		
		}
		
		}

