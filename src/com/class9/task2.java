package com.class9;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		/* Write a program that reads a range of integers 
		 * (start and end point), 
		 * provided by a user and then from that range prints 
		 * the sum of the even and odd integers.	 */

		
		Scanner s=new Scanner(System.in);
		
	System.out.println("Please enter start number");
	int firstNum=s.nextInt();
	System.out.println("Please enter end number");
	int secondNum=s.nextInt();
		
		
		int start = 0;
		int end = 0;
		if (firstNum<secondNum) {
			start=firstNum;
			end = secondNum;
		}else {  // assuming first number > second number
			start = secondNum;
			end = firstNum;
		}
		

		int even = 0;
		int odd = 0;
		
		for (int a=start; a<=end; a++ ) {
			
			if (a%2==0) {
			even = even+a;
			}else {
				odd = odd+a;
			}
			
		}
			System.out.println("The sum of even number "+even);
			System.out.println("The sum of odd number "+odd);

	
			
			
		System.out.println("====================2. cozum ========================");
		
    Scanner scan=new Scanner(System.in);
        
        System.out.println("Please enter a number");
        int n1=scan.nextInt();
        System.out.println("Please enter s greater number");
        int n2=scan.nextInt();
        int sumOdd = 0,sumEven = 0;
        while (n1<=n2) {
            if (n1%2==0) {
                sumEven+=n1;
            }
            else {
                sumOdd+=n1;
            }
            n1++;
        }
        System.out.println("Total of even numbers: "+sumEven);
        System.out.println("Total of odd number: "+sumOdd);
		
	
		
	}

	}
