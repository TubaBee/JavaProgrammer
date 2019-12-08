package com.class31;

public class CarH {
	/*
	 * 
	 * Create a Class Car that would have the following fields:
	 * 
	 * carPrice and color and method calculateSalePrice()
	 * 
	 * which should be returning a price of the car.
	 * 
	 * Create 2 sub classes: Sedan and Truck.
	 * 
	 * The Truck class has field as weight and has its own implementation
	 * 
	 * of calculateSalePrice() method
	 * 
	 * in which returned price calculated as following:
	 * 
	 * if weight>2000 then returned price car should include 10% discount,
	 * 
	 * otherwise 20% discount.
	 * 
	 * The Sedan class has field as length and also does it is own implementation
	 * 
	 * of calculateSalePrice():
	 * 
	 * if length of sedan is >20 feet
	 * 
	 * then returned car price should include 5% discount, otherwise 10% discount
	 * 
	 */

	double carPrice;

	String color;

	public CarH(double carPrice, String color) {

		this.carPrice = carPrice;

		this.color = color;

	}

	public double calculateSalePrice() {

		return carPrice;

	}

	public void display() {

		System.out.println("Sale Price of " + color + " vehicle is $" + carPrice);

	}

}

class SedanH extends CarH {

	int length;

	SedanH(double carPrice, String color, int length) {

		super(carPrice, color);

		this.length = length;

	}

	public double calculateSalePrice() {

		if (length > 20) {

			carPrice = carPrice - (carPrice * 0.05);

		} else {

			carPrice = carPrice - (carPrice * 0.1);

		}

		return carPrice;

	}

}

class TruckH extends CarH {

	double weight;

	TruckH(double carPrice, String color, double weight) {

		super(carPrice, color);

		this.weight = weight;

	}

	public double calculateSalePrice() {

		if (weight > 2000) {

			carPrice = carPrice * 0.90;

		} else {

			carPrice = carPrice * 0.80;

		}

		return carPrice;

	}

}

