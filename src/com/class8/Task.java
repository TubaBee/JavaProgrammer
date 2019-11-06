package com.class8;

public class Task {

	public static void main(String[] args) {

		//Print number from 1 to 100 in 1 line with space
		
		for (int a = 1; a <= 100; a++) {
			System.out.print(a + " ");
		}
		System.out.println(" ");
		
		//Print number from 100 to 1

		for (int a = 100; a >= 1; a--) {
			System.out.print(a + " ");
		}
		System.out.println(" ");
		
		//Print even numbers from 20 to 1 
		
		for (int a = 20; a >= 1; a -= 2) {
			System.out.print(a + " ");
		}
		System.out.println(" ");
		
		//Print odd number between 20 and 50 (2 ways)
		
		for(int i=21; i<50; i+=2) {
			System.out.print(i + " ");
		}
		//2. way
		for (int a = 20; a <= 50; a++) {
		if (a%2==1) {
		System.out.print(a + " ");
		}
		}		
		System.out.println(" .................................");
			
			//what is the output
			
			int sum=0;
			for (int i=1; i<=5; i++) { //1,3,6,10,15
				sum = sum + i;
				System.out.print(sum +"+");
			}
			System.out.println();
			System.out.println(sum);	
			
			
			// what is the output
			
			int sumAll=0;
			for (int i=0; i<=20; i+=5) { //0, 5, 10, 15, 20
				sumAll= sumAll +i;
			}
			
			System.out.println(sumAll);
			
			//what is output
			int total=2;
			for (int y=1; y<=3; y++) { //2,4,12
				total=total*y;
			}
			System.out.println(total);
			
			
			
			
		}
	}


