package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//max 2147483647 number deger atanabilir
				
		int[] num=new int[4];
		num[0]=12;
		num[1]=13;
		num[2]=14;
		num[3]=15;
		//to find # number of elements we use .lenght
		System.out.println(num.length);//kac element oldugunu gosterir
										//4 
		System.out.println(num[0]);
		
						// 0		 1		  2			3
		String[] array= {"Winter", "Fall", "Summer", "Spring"};
		//I was born in Summer
		
		System.out.println("I was born in "+array[2]);
	//	System.out.println(array.length);
		//array.length will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);
		
		int[] score= { 80, 90, 70, 100, 99};
		
	
	}

}
