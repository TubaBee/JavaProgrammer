package com.class38;

public class ThrowsExample {
	static String name="John";
	
	public static void StudentSleeping() throws InterruptedException {
		System.out.println("Strudent is "+name+" is sleeping");
		Thread.sleep(3000);
	}
	
	public static void callingSleepingStudent() throws InterruptedException {
		StudentSleeping();
		
	}
	
	public static void callingMore() {
		try {
			callingSleepingStudent();
		} catch (InterruptedException e) {
			System.out.println("Interrupted exception");
		}
	}
	
	
//	public static void deneme() {
//		try {
//			callingSleepingStudent();
//			System.out.println("Hey ogrenci uyaaaaaaaaaaaaannnn");
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) throws InterruptedException {
		callingMore();
		//deneme();
		
	}
	
}
