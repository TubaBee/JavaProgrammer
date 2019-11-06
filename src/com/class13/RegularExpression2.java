package com.class13;

public class RegularExpression2 {

	public static void main(String[] args) {
		
		String str="Today is our3 java class5";
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replaceAll("\\s", ""));
		System.out.println(str.replace("\\w",""));
		
		String doc="Video provides a powerful way to help you"
				+ " prove your point. When you click Online video,"
				+ "want to add. You can also type a keyword to search "
				+ "online for the video that best fits your document.";
		System.out.println(doc.toLowerCase().replace("video", "Audio"));
	System.out.println(doc.replaceAll("powerful(.*)",""));
	
	
	
	}

}
