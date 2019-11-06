package com.class12;

public class StringMiniPulationDemo{

	public static void main(String[] args) {
		//There are two ways to create string objects.
		//1
		//String Literal
		String name="John";
		 System.out.println(name);
		//yazilan isimdeki harf sayisini verir
		  System.out.println("The length of name is "+name.length()); 
		//2
		//Creating String with new kew word
		String name1=new String("John1");
		
		
		/*The method returns the length of this string.
		 * The length is equal to the number of 16 bit 
		 * Unicode cahracters in the string.
		 */
		
		int name1Len = name.length();
		System.out.println(name1Len);
		
		System.out.println("...................");
		/*.toLowerCase();
		 * This method convert all of the character
		 * the string to Lowercase
		 */
		String str1="Hello WORLD";
		System.out.println("Before: "+str1);
		str1=str1.toLowerCase();
		System.out.println("After : "+str1);
	System.out.println("==============");	
		//.equals()  method
		//This method count everthing such capitalization and content
		String str2="Hello WoRLd";
	boolean isEqual=	str1.contentEquals(str2);
		System.out.println(isEqual);  //false
		
		//.equalsIgnoreCase();
		//This method does not care for capitalization 
		//and compare the content only
		System.out.println(str1.equalsIgnoreCase(str2));  //true
		
		/*.toUpperCase();
		 * This method convert all of the character
		 * the string to Uppercase
		 */
		
		
		String str3="Muhammad";
		System.out.println("Before: "+str3);
		str3=str3.toUpperCase();
		System.out.println("After: "+str3);
		
		
	}

}
