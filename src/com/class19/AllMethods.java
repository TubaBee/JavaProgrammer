package com.class19;

public class AllMethods {

	//Create methods to return value of sum
	//subtraction
	//mult
	//div
	
	int sum(int num1, int num2) {
		int result=num1+num2;
		return result;
	}
	
	int sub(int num1, int num2) {
		int sub=num1-num2;
		return sub;
	}
	
	int div(int num1, int num2) {
		int div=num1/num2;
		return div;
	}
	
	int mult(int num1, int num2) {
		int multy=num1*num2;
		return multy;
	}
	
	int findLargest(int num1, int num2) {
		int largest;
		if (num1 > num2) {
			largest = num1;
		} else {
			largest = num2;
		}
		return largest;
	}
	
	//method to return whether number is even or odd
	
	boolean isOdd(int num) {
		boolean isOdd;
		if (num%2!=0) {
			isOdd=true;
		}else {
			isOdd=false;
		}return isOdd;
		
	}
	
	/**method will take a week day number and return
	 * a week day name
	 */
	
	String weekDayName(int weekDay) {
		String weekDayName;
		switch(weekDay) {
		case 1:
			weekDayName="Monday";
			break;
		case 2:
			weekDayName="Tuesday";
			break;
		case 3:
			weekDayName="Wednesday";
			break;
		case 4:
			weekDayName="Thursday";
			break;
		case 5:
			weekDayName="Friday";
			break;
		case 6:
			weekDayName="Saturday";
			break;
		case 7:
			weekDayName="Sunday";
			break;
		default:
			weekDayName="Unknown";
		}return weekDayName;
	}
	
	
}
