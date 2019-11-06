package com.class7;

public class DoWhile {

	public static void main(String[] args) {
//mostly used
		int num=10;
		
		while (num<=7) {
			System.out.println("Hello");
			num++;
		}
//rare	
		int num1=10;
		do {
			System.out.println("Bye");
			num1++;
		}while(num1<=7);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");

		//print even numbers from 20 to 50 using do while
		
		int a = 20;
		do {
			System.out.println(a);
			a+=2;
		}while(a <= 50);
		
		System.out.println("Second way............");
		//2 way
		int b=20;
		do {
			if (b%2 == 0) {
				System.out.println(b);
			}b++;
		}while(b <= 50);
		
		
		
	}

}
