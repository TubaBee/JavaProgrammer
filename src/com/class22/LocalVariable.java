package com.class22;

public class LocalVariable {

	public static void main(String[] args) {
		//I want to access variable myName from different method
		LocalVariable obj=new LocalVariable();
		obj.sayName();
		System.out.println("______________");
//		System.out.println(myName);
		
		String userEmail= obj.createEmail("John", "Smith", "outlook");
		System.out.println(userEmail);
	}
	
	void sayName() {
		String myName="John";
		System.out.println(myName);
		//Wont be accessable, scope is only within main method
		//System.out.println(obj);
	}
	
	String createEmail(String name, String lastName, String email) {
		String userEmail=name+lastName+"@"+".com";
		return userEmail;
		
	}
	

}
