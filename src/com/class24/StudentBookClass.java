package com.class24;

/*Write program as a Student class   that has instance variables name and address. Create a constructor that will initialize those variables. Print name & address of given  student by the displayInfo method.

Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed   */

public class StudentBookClass {
	public static void main(String[] args) {
		StudentTask obj=new StudentTask("Tuba","Orlando");
		StudentTask o=new StudentTask();
		obj.display();
	}

}
