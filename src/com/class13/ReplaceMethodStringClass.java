package com.class13;

public class ReplaceMethodStringClass {

	public static void main(String[] args) {
		/*.replace();
		 * This method returns a new String resulting
		 * from replacing all occurrences of oldChar
		 * in this string with newCahr. 
		 */
		//regex == reguler experetion
		
		String str="Hello Dear Dan, how are you Dan, How you been?";
		System.out.println(str.replace('n', 'z'));
		
		System.out.println(str.replaceAll("Dan","Tuba"));
		System.out.println(str.replaceFirst("Dan", "Ali"));
		/*
		 * print only text and not numbers
		 */
		
		String str1="346385683568Hello2324324";
		System.out.println(str1.replaceAll("[0-9]",""));//leave only text
		System.out.println(str1.replaceAll("[a-zA-Z]",""));//leave only numbers
		System.out.println(str1.replaceAll("[^0-9]","")); //leave only numbers
		
		//Remove everything except text and numbers
		String str2="Hi#$%^&How@#$%^8World758435";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str2.replace("How", ""));
		
		
		String str3="12-22-1990"; //12/22/1990
		System.out.println(str3.replace('-', '/'));
		System.out.println(str3.replaceFirst("-", "/"));
		
		System.out.println("//\\");
		
		System.out.println(str2.replaceAll("\\w", ""));
		
		
	}

}
