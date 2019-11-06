package com.class13;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your class day:: ");
		
		String day=scan.nextLine();
		
		if (day.trim().toLowerCase().equals("Saturday")) {
			System.out.println("Saturday is your Java Class");
		}else if(day.trim().toLowerCase().equals("Sunday")) {
			System.out.println("Sunday is your Git Class");
		}else if (day.trim().toLowerCase().equals("Tuesday")) {
			System.out.println("Tuesday is your SDLC Class");
		}else if (day.trim().equalsIgnoreCase("Thursday")) {
			System.out.println("Thursday is your Manuel Testing Class");
		}else {
			System.err.println("Envalid Entery!! Please enter a valid class day");
		}
		scan.close();
	}

}
