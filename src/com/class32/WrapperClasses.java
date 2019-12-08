package com.class32;

public class WrapperClasses {
	public static void main(String[] args) {

		int num = 10;
		// Autoboxin --> converting primitive type into an Object type
		Integer integer = 1001010;
		System.out.println(Integer.MIN_VALUE);
		String str = integer.toString();
		System.out.println(str);

		// converting boolean primitive type Boolean Object type
		Boolean bool = true;

		Byte $b = 20;
		System.out.println($b.MAX_VALUE);
		
		//AotoUnBoxing --> converting object type into a primitive type
		
		@SuppressWarnings("deprecation")
		int num1=new Integer(10);
		System.out.println(num1);
		
	}
}
