package com.class17;

public class Car{

		//define attributes/ features
		
		String make, color,model;
		int year, wheels, windows,speed;
		boolean radio;
		 
		//adding behaviour/ action --> methods();
		
		void drive() {
			System.out.println("I am drive method");
			System.out.println("Car "+make+" can drive");
		}
	
		void start() {
			System.out.println("I am start method");
			System.out.println("Car "+make+" can start");
		}
		
		void accelerate() {
			System.out.println("I am accelerate method");
			System.out.println("Car "+make+" can accelerate");
		}
		
}
