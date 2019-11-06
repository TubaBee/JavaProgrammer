package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		//say good morning 5 times
		//initialize test condition increment
		for (int i=0; i<=4; i++) {
			
			System.out.println("Good morning");
		}

		//print number from 1-10;
		for (int a=1; a<=10; a++) {
			System.out.println(a);
		}
		
		//print number from 10 to 1
		for (int a=10; a>=1; a--) {
			System.out.println(a);
		}
		
		for (int a=0; a<=50; a+=5) {
			System.out.println(a);
		}
		
	}

}
