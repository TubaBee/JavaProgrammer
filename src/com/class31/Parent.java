package com.class31;

public class Parent {

	static 	void hello() {
		System.out.println("Hello form Super class");
//eger static olursa child class syso cikmaz 
		//you don’t want to override it but want to have the same method signature.
		
	}
}

class Child extends Parent {
	static  void hello() {
		System.out.println("Hello form Sub class");
	}

}