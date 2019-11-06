package com.class9;

public class NestedLoop {

	public static void main(String[] args) {
	
		for (int i=1; i<=5; i++){ //- outer loop control repetition of 							inner loop
			System.out.println("I am outer loop");

			for (int j=1; j<=2; j++){
			System.out.println("I am inner loop");
		 }
		}
		
	}

}
