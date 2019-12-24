package com.class38;

public class ThrowKeyword2 {

	public static void main(String[] args) {
	checkAge(17);

	}
	
	//create a method that will check id user is older than 18
	//if it is not then we want to show an exception
	
	public static void  checkAge(int age) {
		if (age>=18) {
			System.out.println("You can give driver Licence");
		}else {
			throw new RuntimeException("You must be older than 18");
		}
	}

}
