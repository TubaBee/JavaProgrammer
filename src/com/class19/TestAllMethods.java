package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		// find the largest number from 300 and 500
		// then identify is the largest number is odd

		AllMethods obj = new AllMethods();
		int large = obj.findLargest(300, 500);
		System.out.println(large);

		boolean odd = obj.isOdd(large);
		System.out.println(odd);
		
		//call method weekdayname
		// if (tuesday,wednesday,thursday,Saturday,sunday)--> I am learning java
		
		String day=obj.weekDayName(5);
		if (day.equals("Tuesday") || day.equals("Wednesday") ||day.equals("Saturday")||day.equals("Sundayday")) {
			System.out.println("I am learning Java");
		}else {
			System.out.println("I am practising Java");
		}
	}
}
