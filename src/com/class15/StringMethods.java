package com.class15;

public class StringMethods {

	public static void main(String[] args) {
		// replace
		
		String str="Java classes at Syntax are awesome";
		str=str.replace("awesome","great");
		System.out.println(str);
		str=str.replace("Git","SDLC");
		System.out.println(str);
		
		str=str.replace("a","A@A%&8");
		System.out.println(str);
		
		//replaceAll -->specify regular expression
		//lets remove all special chracters
		
		str=str.replaceAll("[^a-z0-9A-Z]", "");
		System.out.println(str);
		
		String myString ="Java classes at Syntax are awesome";
		String[] array=myString.split("a");
		System.out.println(array.length);
		
		
	}

}
