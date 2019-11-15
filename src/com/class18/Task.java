package com.class18;

public class Task {

	public static void main(String[] args) {
		Task word = new Task();
		word.evenOddNumber(8);
		word.maxMinNumber(89, 65);//argument
		word.palindrome("madam");//argument

	}
	
	// Create a method that will take 2 parameters as a numbers and prints which number is larger.
	 //methodName (2 int type parameters)
	void maxMinNumber(int a, int b) {
		if (a < b) {
			System.out.println(b + " is larger than "+a);
		} else {
			System.out.println(a + " is larger than "+b);
		}

	}

	// Create a method that will take a number and prints whether the number is even or odd.
	 
	void evenOddNumber(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is Even number");
		} else {
			System.out.println(a + " is Odd number");
		}
	}

	// Create a method that will print whether given String is palindrome or not.
	
	void palindrome(String pal) {
		 String reversd="";
		for (int i = pal.length() - 1; i >= 0; i--) {
			reversd = reversd + pal.charAt(i);// +k=k+a=ka+k
		}
		

		if (pal.equals(reversd)) {
			System.out.println(reversd+" is a palindrom");

		} else {
			System.out.println(reversd+" is not palindrom");
		}
	}

}
