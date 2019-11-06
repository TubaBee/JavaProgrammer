package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		/*.toCharArray
		 * This method converts this string to a new character array
		 */
		
		String str="Syntax Tecnologies";
		System.out.println(str.toCharArray());
		
		char[] array=str.toCharArray();
		
		for (char i : array) {
			System.out.println(i);
		}	
		
		System.out.println(".........");
			char b='w';
			char c='a';
			System.out.println(b+"\n"+c);
			
			
			
		
		
		
		
	}

}
