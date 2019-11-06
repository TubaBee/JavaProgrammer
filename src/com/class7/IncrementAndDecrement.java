package com.class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		a=a+1; // assigment
		a+=1; //Shorhand assigment

		System.out.println(a); // 12
		a++; // increment operator
		System.out.println(a); //13
		
		int b =10;
		b-=1; //9
		b--;//8 decrement operator
		System.out.println(b); //8
		
		//with increment &decrement operators can be used 
		//only with variable
		
		int c=23;
		c++;
		//1++; compiler error invalid argument
	}

}
