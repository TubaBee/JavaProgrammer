package com.class27;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}

}

class Monkey extends Animal{
	//cannot override static method with instance method
//	public void whoAmI() {
//		
//	}
//we cannot override static method
//when both methods are static within Sub and
	//method hiding
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}
