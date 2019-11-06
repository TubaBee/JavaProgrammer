package com.class7;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*You need to ask user to pay for coffe 
		 * You need to keep asking user to pay for it until
		 * entered price is equal=5;
		 * After user paid then say "Enjoy your coffee!";
		 */

		Scanner scan=new Scanner(System.in);
		int pay=1;
		
		do{
		
			System.out.println("Please pay for coffee");
			pay=scan.nextInt();
		//don't need increment because of != esit olana kadar dongu devam eder
			
		
		}while (pay != 5);
		
		System.out.println("Enjoy your coffee");
		
		
	//.........while ile yapilisi...............		
		int pay1;
		System.out.println("Please pay for coffee");
		pay1=scan.nextInt();
		
		while(pay1!=5) {
			System.out.println("Please pay for coffee");
			pay1=scan.nextInt();
		}System.out.println("Enjoy your coffee");
	}	
		
	

	
	
	}


