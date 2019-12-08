package com.class27;

public class finalKeyword {
	
	public final String str="Hello";
	
	public static void main(String[] args) {
		
		String str="I am awesome";
		str="I am cool";
		System.out.println(str);
		
		final String finalString="Java is easy";
	//	finalString="Java is hard"; ce
		
		final int age=120;
		//age=100; ce
		
		finalKeyword obj=new finalKeyword();
		System.out.println(obj.str);
		
		
	}

	public final void hello() {
		System.out.println("I am a final method in Parent class");
	}
}
//can we overload a final method

class FinalHeywordChild extends finalKeyword{
	//final method cannot be overriden, we will get CE(compiler error)
//	public final void hello() {
//		System.out.println();
//	}
}