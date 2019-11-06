package com.class11;

public class Task1 {

	public static void main(String[] args) {
	/*	Create an array of cars and store 6 elements into it. 
	 * Using 2 different loops print all values from the array.
	 */
		String [] car= {"Toyota","BMW","Honda","Jeep","Mercedes","Nissan"};
		
		for(int a=0;a<car.length; a++) {
			System.out.println(car[a]);
		}
		
		
	System.out.println(".................");	
		
	/*	Create an array on integers and calculate 
	 * the sum of all elements 
	 */
		
		int [] calculate= {1,2,3,4,5,6};
		int sum =0;
		for(int c=0; c<calculate.length; c++) {
			System.out.println(calculate[c]);
		 sum=sum+calculate[c];
		}
		System.out.println(sum);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	/*	Create an array of countries.
	 *  While retrieving all values from an array print capital 
	 *  for each country. (use 2 different loops).
	 */

		String [] country= {"TURKEY","IRAN","USA","FRANCE"};
	//	for(int b=0; b<country.length; b++) {
	//		System.out.print(country[b].contentEquals("USA"));		
			
		
		
		for(String s:country) {
			if (s.contentEquals("TURKEY")) {
			System.out.println("The Capital of Turkey is Ankara");
			
			}
			if (s.equals("IRAN")) {
				System.out.println("The Capital of Iran is IHalep");
			
			}
			if (s.contentEquals("USA")) {
					System.out.println("The Capital of USA is Washigton DC");
					
			}
			if (s.contentEquals("FRANCE")) {
						System.out.println("The Capital of France is Paris");
					
			}
			
		}
		
			}}
