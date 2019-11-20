package com.class20;

public class MySonMath {
	public	String name;
	String phone;
	private String SSN;
	protected String birthday;
	int phoneNumber;


	//public can be accessed from everwhere
	public void add1() {
		int num1 =2;
		int num2 =1;
		int result = num1 +num2;
		
	}
	//default can be seen /accessed within package
	void add2(int num1, int num2) {
		int result = num1+ num2;
		
	}
	//protected can be seen/accessed within package
	protected int add3() {
		int num1 =2;
		int num2 =3;
		int result = num1 +num2;
		return result;
		
	}
	
	protected int add4(int num1, int num2) {
		int result =num1+num2;
		return result;
	}
	
	//private can be seen/accessed only within this class
	private void add5() {
		
	}
	
	
}
