package com.class23;

public class BetterCar {
	/*
	 * we want to built make as Toyota cars that will have different models and
	 * color
	 */

	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	BetterCar(String carModel, String carColor,int carSpeed, int carDoor){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoor;
	}
	

	public static void main(String[] args) {
		make="BMW";
		//compiler will give an error, we have to pass value when we built an object
		//those value will be passed as argument to the constructor 
		//throught constroctur instance variables will get initialized
		//BetterCar bcar1=new BetterCar();
		BetterCar bcar1=new BetterCar("X5","Blue",400,2);
		bcar1.getDetails();	
		
	}

	public void getDetails() {
		System.out.println("I built " + color + " " + make + " " + model);
		System.out.println("My car has "+doors+" doors can have speed up to "+speed);
	}

	

}
