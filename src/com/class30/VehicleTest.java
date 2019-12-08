package com.class30;

public class VehicleTest {

	public static void main(String[] args) {

		BMW bmw = new BMW("544mdbvnb983", "Sedan", "BMW", "X5");
		BMW.displayTotal(); //1 or 3
		//Vehicle.displayTotal();
		//come from Vehicle class
System.out.println("-----BMW-----");		
		bmw.drive();
		bmw.stop();
		bmw.start();
		bmw.speed();
		// comes from car class
		bmw.breaking();
		// comes from BMW
		bmw.display();
System.out.println("-----Car-----");
		Car car = new BMW("9999cccccc9", "Ayse", "BMW", "X5");
		// comes from Vehicle class
		car.drive();
		car.stop();
		car.speed();
		car.start();
		// comes from Car class
		car.breaking();
		// comes from BMW - wont be available to the parent
		// car.display();
System.out.println("-----Vehicle-----");
		Vehicle vehicle = new BMW("11111pppp11", "Fatma", "BMW", "X5");
		// comes from Vehicle class
		vehicle.drive();
		vehicle.stop();
		vehicle.speed();
		vehicle.start();
		// comes from Car class- wont be available to the parent
		// vehicle.breaking();
		// comes from BMW - wont be available to the grandparent
		// vehicle.display();
		
		new BMW("87996","Truck","BMW","A7");
		new BMW("fdjf87996","Sedan","BMW","i3");
		new BMW("lsfj87996","Sedan","BMW","i7");
		
		System.out.println("-----------");
		BMW.displayTotal();
		
	}

}
