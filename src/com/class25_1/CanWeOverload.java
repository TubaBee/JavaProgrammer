package com.class25_1;

public class CanWeOverload {

	// can we overload a private method? --Yes

	private void methodOne() {
		System.out.println("I am method One");
	}

	private void methodOne(String str) {
		System.out.println("I am method One with " + str);
	}

	// can we overload a main method? --yes
	//can we overloading a static method?--yes

	public static void main(String str) {
		System.out.println("I am a main method with String argument");
	}
	
	public static void main(String str, String [] args) {
		System.out.println("I am a main method with 2 parameters");
	}
	
	public static void main(String[] args) {

		System.out.println("I am a main method with String array");
		CanWeOverload.main("String");
		String[] array= {"A","B"};
		main("Hello", array);
				
		}
	}
	
	

