package com.class20;

public class Task {
	/*Create a method that will take 1 parameter as a String and return reversed 
	 * String. Method should be visibly only within same package.
	 */
	protected String reversString(String str) {
		String result="";
		char[] charArray=str.toCharArray();
		for (int i = charArray.length; i >=0; i--) {
			result+=charArray[i];
		}
		return result;
	}
	
	
	/*Create a method that will take a String and return 
	 * whether String is palindrome or not. 
	 * Method should be available to all classes within your projects.
	 * 
	 */
	public boolean isPalindrom(String pword) {
		boolean result=false;
		
		String str = null;
		String revers=reversString(str);
		if (pword.equalsIgnoreCase(pword)) {
			System.out.println(result+" This is Palindrome word");
		}else {
			System.out.println(result+" This is NOT palindrome word");
		}
		return result;
			
	}
/*Create a method that will take a string and 
 * return an array of words from that string.
 *  Method should be available only within same class.
 * 
 */
	
	private String[] arrayOfString(String sentence) {
		
//		String[] stringArray=sentence.split(" ");
//		return stringArray;
		
		return sentence.split(" ");
	}
	
	public static void main(String[] args) {
		
		Task obj=new Task();
		
		String str1="Anna";
		String re=obj.reversString(str1);
		System.out.println(re);
	
	
	String str ="Syntax";
	boolean result2=obj.isPalindrom(str);
	System.out.println("is \""+str +"\"Palindrome? "+result2);
	
	String[] strArray=obj.arrayOfString("What a beatiful day is today!");
	for (String word : strArray) {
		System.out.println(word);
	}
	
	
	}
}
