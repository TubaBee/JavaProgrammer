package com.class29;

public class TaskTest {

	public static void main(String[] args) {
	
		Task obj=new JavaFile();
		obj.open();
		obj.close();
		System.out.println("```````````````````");
		Task obj1=new WordFile();
		obj1.open();
		obj1.edit();
		System.out.println("....................");
		Task obj2=new PDFFile();
		obj2.open();
		obj2.edit();
		obj2.close();
	}

}
