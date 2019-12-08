package com.class23;

public class Task {
	/*1-Write a program that will have a constructor: 
	 * one with parameters and second without any parameters. 
	 * Create a separate Test class where you will execute both of the constructors.

	NOTE: please use different names for instance and local variables. 
	 */
		String s;
	 static String t;
		
	Task(String str){
		s=str;
		System.out.println("with parameter");
	}
	
	Task(){
		System.out.println(" without any parameter");	
		}
	
	public static void main(String[] args) {
		Task t=new Task();
		Task t1=new Task("1. task is done");
		
	}
	
	
	

}
