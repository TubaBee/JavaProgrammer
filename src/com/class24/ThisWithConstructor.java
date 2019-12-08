package com.class24;

public class ThisWithConstructor {
	ThisWithConstructor() {
		System.out.println("I am non argument constructor");
	}

	ThisWithConstructor(String str) {
		this(); // used to call current class constructor
		System.out.println("I am constructor with 1 String parameter "+str);
	}

	ThisWithConstructor(String ab, int a) {
		this(ab);//always MUST be a first statement
		//this(); //this is a second 
		System.out.println("I am constructor with 2  parameters "+ab+"--"+a);
	}

	public static void main(String[] args) {
		ThisWithConstructor obj = new ThisWithConstructor("Hello");
		// can we axecute 2 constructors when creating on object at the same time
		// yes - it can be achieved usin this()
		//this type of constructor calls is knwn as CONSTRUCTOR CHAINING
		ThisWithConstructor obj1=new ThisWithConstructor("Bye",2);
	}

}
