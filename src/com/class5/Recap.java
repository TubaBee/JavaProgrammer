package com.class5;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		
	

	Scanner anyVariableName=new Scanner(System.in);
	
	System.out.println("Pelase enter Sring value");
	String val1=anyVariableName.nextLine(); //take entire line

	
	System.out.println("Please enter boolean value");
	boolean val=anyVariableName.nextBoolean();

	System.out.println("Pelase enter String value");
	String val2=anyVariableName.nextLine(); //take first word until space
	
	System.out.println("Pelase enter integer value");
	int val3=anyVariableName.nextInt();
	
	System.out.println("Pelase enter double value");
	double val4=anyVariableName.nextDouble();
	
	System.out.println(val);
	System.out.println(val1);
	System.out.println(val2);
	System.out.println(val3);
	System.out.println(val4);
	
	}

}