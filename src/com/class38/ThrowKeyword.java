package com.class38;

public class ThrowKeyword {

	public static void main(String[] args) {
		throwingException();

	}
	
	public static void throwingException() {
		System.out.println("Creating an exception");
		ArithmeticException ae=new ArithmeticException();
		throw(ae);
	}
	
	public static void callingExceptionMethod() {
		try {
			throwingException();
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception got caught");
		}
		
	}

}
