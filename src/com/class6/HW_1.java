package com.class6;

import java.util.Scanner;

public class HW_1 {

	public static void main(String[] args) {
		/*Write a program to find largest of three double values using
		 * if else...if and logical operator provided by a user 
		 * (number must be distinct) */
		Scanner scan=new Scanner(System.in);
		String firstNumber,secondNumber,thirdNumber;
		double a,b,c;
		System.out.println("Please enter three distinct number ");
		System.out.print("First number : ");
		a=scan.nextDouble();
		System.out.print("Second number : ");
		b=scan.nextDouble();
		System.out.print("Third number : ");
		c=scan.nextDouble();
		
		if (a>b && a>c ) {
			System.out.println(a+" largest number than "+b  +" and " +c);
		}else if(b>a && b>c) {
			System.out.println(b+" largest number than "+a +" and "+c );
		}else if (c>a && c>b) {
			System.out.println(c+" largest number than "+b+" and "+a);
		}else {
			System.out.println("invalid number ");
		}
		
//............other yontem.. homework 1..................................
			// TASK 2 find the largest number using nested if
		/*Program to find largest among three number
		 *  using nested if
		 * provided by user (number must be distinct)
		  */		
		
			System.out.println("Please enter 3 distinct numbers for Nested If Task");

			double no1 = scan.nextDouble();
			double no2 = scan.nextDouble();
			double no3 = scan.nextDouble();
			if (no1 != no2 || no2 != no3) {
			
			if (no1 > no2) {
						if (no1 > no3) {//no1>no2 && no1>no3
							System.out.println("Largest number is first - " + no1);
						} else {//no1>no2 but no1<no3
							System.out.println("Largest number is third - " + no3);
						}
			} else {//assuming no2>no1
						if (no2 > no3) {//no2>num1 && no2>no3 --> no2 =largest
							System.out.println("Largest number is second - " + no2);
						} else {//no2>no1 but no2<no3
							System.out.println("Largest number is third - " + no3);
						}
			}
	
			}else	{
				System.out.println("Numbers are equal");
			}
		
			
			
			
		
		
		

	}

}
