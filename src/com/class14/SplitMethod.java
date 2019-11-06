package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		/*.split()
		 * This method split this string around matches of thegiven regular expression
		 */
		
		
		//split the following string into array of strings/work
		String str="Video provides a powerful way to help you prove your point. When you click Online video, want to add. You can also type a keyword to search online for the video that best fits your document.";
		String[] array=str.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		} System.out.println("`````````````````");
		//How can be find how mant sentences are in the following string
		
		String str1="Today is Sunday. Its sunny day. and we are having java class ";
		
		String[] array2=str1.split("\\.");
		
//		for (String string : array2) {
//			System.out.println(string.trim());
//		}
		
		//trim sadece String de yapilir baska bir yerde yapmaya calisirsan hata verir
		
		
		
	}

}
