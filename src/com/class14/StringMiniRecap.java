package com.class14;

public class StringMiniRecap {

	public static void main(String[] args) {
		String str=new String("Hello");
		System.out.println(str);
		String str2=str.replaceAll("Hello", "Bye");
		System.out.println(str);
		
		//.replace
		String str3="your Syntax Technologies";
		System.out.println(str3.replace('y','i'));
		
		System.out.println(str3.replace("your","My"));
	
		//.replaceAll
		String str4="\"Video provides a powerful way to help you"
				+ " prove your point. When you click Online video,"
				+ "want to add. You can also type a keyword to search "
				+ "online for the video that best fits your document.";
		System.out.println(str4.replaceAll("way(.*)",""));
	
		String str5="*())35235252Hel4343l34o4343(()*";
		System.out.println(str5.replaceAll("[0-9]",""));
		System.err.println(str5.replaceAll("[^A-z]",""));
		
		System.out.println("................");
		System.out.println(str4.replaceFirst(" ", ""));
	
		System.out.println("~~~~~~~~~~~~~~`````````");
		
		System.out.println(str4.toLowerCase().replace("you ","sen "));
		System.out.println(str4.replaceFirst(" ", ""));
		System.out.println(str4.replaceAll("\\w",""));
	
	}

}
