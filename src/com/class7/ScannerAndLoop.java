package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		/* ask user enter name 5 times
		 * and our output should be "Good afternoon____" */
		
		Scanner scan=new Scanner(System.in);
		int a=1;
		while(a<6) {
				
		System.out.print("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Good afternoon "+name);
		a++;
		}
	}

}
