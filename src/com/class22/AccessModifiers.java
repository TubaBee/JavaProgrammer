package com.class22;

public class AccessModifiers {
public static String language;


	public static void hello() {
		System.out.println("hello");
	}
	
	
	protected static void hello1() {
		System.out.println("hello1");
	}
	
	 static void hello2() {
		System.out.println("hello2");
	}
	
	private static void hello3() {
		System.out.println("hello3");
	}
	
	public static void main(String[] args) {
		AccessModifiers.hello();
		AccessModifiers.hello1();
		AccessModifiers.hello2();
		System.out.println(AccessModifiers.language);
		//not acceptable since permission  is set to premission
		//AccessModifiers.hello3();
		
	}

	
	
}
