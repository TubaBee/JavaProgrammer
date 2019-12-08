package com.class31;

/*Create an Interface ‘Shape’ with undefined methods as calculateArea and 
 * calculatePerimiter . Create 2 child classes: Circle & Square that should have 
 * an implementation of area and perimeter calculation. Test your code. */

public interface Shape {
	
	 
	 void calculateArea(int r);
	void calculatePerimiter(int r);

}

class Circle implements Shape{
	 static double pi=3.14;
	@Override
	public void calculateArea(int r) {
		System.out.println("Circle Area="+(r*r*pi));
		
	}

	@Override
	public void calculatePerimiter(int r) {
		System.out.println("Circle Perimeter="+(2*r*pi));
	}
	
}


class Square implements Shape{

	@Override
	public void calculateArea(int a) {
		System.out.println("Square Area="+(a*a));
		
	}

	@Override
	public void calculatePerimiter(int a) {
		System.out.println("Square Perimeter="+(4*a));
		
	}

	
}