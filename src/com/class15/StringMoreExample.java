package com.class15;

public class StringMoreExample {

	public static void main(String[] args) {
		//get a character a specific location
		String str="Syntax Tecnologies Inc";
		
		char letter=str.charAt(5);
		System.out.println(letter);
		
	//	System.out.println(str.charAt(str.length())); //StringIndexOutOfBoundsException

		System.out.println(str.charAt(str.length()-1));
		
		//get a substring from a String
		//Syntax
		String substr1=str.substring(0,6);
		System.out.println(substr1);
		//Tecnologies Inc
		String substr2=str.substring(7);
		System.out.println(substr2);
		
	}

}
