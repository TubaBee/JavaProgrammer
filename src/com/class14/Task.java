package com.class14;

public class Task {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
		 */
		String str="Create a String that will hold a sentence. "
				+ "Write a program to get a new String without any spaces.";
		
		System.out.println(str.replaceAll(" ",""));
	System.out.println("--------------------");	
		
	/*	Create a String that should be combination of letters, 
	 * numbers and special characters. Find out how many alpha 
	 * characters are there in the String.
	 */
		
		String str1="Howmany12carachter+!inthe*^%$string";
		String def=str1.replaceAll("[^A-Za-z0-9]","");
		System.out.println();
		System.out.println(def.length());
		
		String str4= "9876$%^5Wha**^&t432to123type";
        System.out.println(str4.replaceAll("\\w", "" ));
        String str5=(str4.replaceAll("[^A-Za-z]", ""));
        System.out.println(str5.length());

		
		
		
		
		
		System.out.println("````````````````````````");
		
		/*You have a String a=”Is it saturday? Is it raining? 
		 * Do we have a Java Class today?” How would you find out
		 *  how many sentences are in that String?
		 */
	
		String str2="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array=str2.split("\\?");
		System.out.println(array.length);
		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i].trim());
//		}

	}

}
