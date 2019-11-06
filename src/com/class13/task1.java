package com.class13;

public class task1 {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday->yadnuS)
		
		String day ="Sunday";
		for(int x=day.length()-1; x>=0; x--) {
		System.out.println(day.charAt(x));
		}

		System.out.println(".....................");
		
		/*Create a String and if the String is not empty perform the following
		 * if the String has an odd number of characters
		 * and has 3 or more characters, print the chracter
		 * in the middle of the String.
		 * 
		 */
		
		String val="Hello worlds";
		int mid=val.length();
	//	System.out.println();
		 if (!(val.isEmpty())) {
	        if (mid%2==1 && mid>=3) {
	               System.out.println(val.charAt(mid/2));
		
		
	}
}
	       }}
