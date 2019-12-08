package com.class31;

public class CarTest {

	public static void main(String[] args) {
//		Car c=new Sedan();
//		c.carPrice=3000;
//		c.color="Black";
//		System.out.println(c.calculateSalePrice(4000));
//		
//		Car c1=new Truck();
//		c1.carPrice=1990;
//		c1.color="White";
//		System.out.println(c1.calculateSalePrice(3000));

		
		System.out.println("---------Car---------");

		CarH car = new CarH(2000, "blue");

		System.out.println(car.calculateSalePrice());

		System.out.println("---------Sedan---------");

		SedanH sedan = new SedanH(2000, "pink", 30);

		System.out.println(sedan.calculateSalePrice());

		System.out.println("---------Truck---------");

		TruckH truck = new TruckH(2000, "grey", 3000);

		double price = truck.calculateSalePrice();

		System.out.println(price);

		
		
	}

}
