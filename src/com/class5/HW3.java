package com.class5;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*Write a program that will read three unputs of scores (quiz,mid term, final)
		 * and determine the grade on the following rules:
		 * if the average score >= 90-> grade=A
		 * if the average score >= 70 and <90-> grade=B
		 * if the average score >= 50 and <70 -> grade=C
		 * if the average score ><50 -> grade=F	 */
		
		Scanner scan;
		scan=new Scanner(System.in);
		
		System.out.print("Enter your quiz score : ");
		int quiz=scan.nextInt();
		System.out.print("Enter your Midterm : ");
		int mTerm=scan.nextInt();
		System.out.print("Enter your final socre : ");
		int finals=scan.nextInt();
		int score;
		
		 score=(mTerm+quiz+finals)/3;
		
		 String finall=scan.nextLine();
		if (score>=90 && score<=100) {
			finall="grade=A";
		}else if(score>=70 && score<90) {
			finall="grade=B";
		}else if(score>=50 && score<70) {
			finall="grade=C";
		}else if(score<50) {
			finall="grade=F";
		}else {
			System.out.println("Unknown score");
		}
      System.out.println("Your "+finall+ " socore:  " +score);
      System.out.println("..............Homework 2.......................");
   
      
      
      System.out.println("Enter Whether is Raining now true or false :");
      boolean isRain=scan.nextBoolean();
      String mode="In Class";
      String mode2="Online";
      
      if (!isRain) {
    	  System.out.println(mode);
      }else {
    	  System.out.println(mode2);
      }
      
	}

}
