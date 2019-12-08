package com.class24;

public class StudentTask {
	
	String name, adress;
	
	public StudentTask() {
		System.out.println("This is non parameter constructor");
	}
	
	public StudentTask(String sname, String sadress) {
		name=sname;
		adress=sadress;
	}
	
	public void display() {
		System.out.println("My name is "+name+"\nAdress: "+adress);
	}
	
	
}
