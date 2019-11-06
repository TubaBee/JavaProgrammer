package com.class10;

import java.util.Scanner;

public class HWK2 {

	public static void main(String[] args) {
		
		
		/*Write a guessing game where the user has to guess
		 *  a secret number between 1 and 20. 
		 *  After every guess input, the program tells the user
		 *  whether their number was too large or too small.
		 *  The program will keep asking the user to enter 
		 *  the number until he finds the correct number.
		 *  When the correct answer is found the system 
		 * should display “Congratulations!!. You got it!”		 */
		
		Scanner scan=new Scanner(System.in);
		
		for(int a=-10; a<100; a++) {
			System.out.println("Gessthe screet number between 1 to 20");
			a=scan.nextInt();
			if (a!=7 && a<7) {
				System.out.println("The number you guessed is smaller than the secret number");
				
			}else if(a!=7 && a>7) {
				
				System.out.println("The number you guessed is larger than the secret number");
			
			}else  {
				System.out.println("Congratulations!!. You got it!");
				break;
			}
		}
	
		System.out.println("\\\\\\\\\\\\\\  second example  ///////////////////");
		
		  int user;
	        
	        do {
	            System.out.println("Guess the secret number between 1 and 20");
	            user=scan.nextInt();
	            if(user>8) {
	                System.out.println("The number you guessed is larger than the secret number");
	            }else if(user<8) {
	                System.out.println("The number you guessed is smaller than the secret number");
	            }
	            	
	        }while(user!=8);
	        System.out.println("Congratulations!!. You got it!");	            }
              	
		}		
