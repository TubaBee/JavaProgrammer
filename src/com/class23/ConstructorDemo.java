package com.class23;

public class ConstructorDemo {
	
	ConstructorDemo() {
		System.out.println("I am your constructor");
	}
	ConstructorDemo(String str){
		System.out.println("I am construvtor with 1 parameter "+str);
	}
	ConstructorDemo(int num){
		System.out.println("I am construvtor with 1 parameter "+num);
	}
	
	ConstructorDemo(int num,String str){
		System.out.println("I am construvtor with 2 parameter "+num+str);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println("Code after creating an object");
		
		obj.hello("Hello");
		
		ConstructorDemo obj2=new ConstructorDemo(123, "String");
	}
	
	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructor");
	}
	
	public void hello(String str) {
		System.out.println("Hello Class1");
		System.out.println("Hello Instructor1");
	}

}
