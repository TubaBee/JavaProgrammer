package com.class17;

public class Computer {
	//define features, attributes
	String brand, name,mouse,monitor;
	int screen, memory,size,ram;
	boolean keyboard;
	
	//define behavior, action
	void playGames(){//method header
		//method body
		System.out.println("I can play on my "+name);
	}
	
	void javaCoding() {
		System.out.println("I can do Java coding on my "+name);
	}

	 void watchMovie() {
		System.out.println("I can watch movie on my "+name);
	}
///////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		
		Computer com1=new Computer();
		com1.brand="Apple";
		com1.name="MacBook Pro";
		com1.keyboard=true;
		
		System.out.println("I have "+com1.brand+" "+com1.name);
		com1.javaCoding();
		com1.watchMovie();
	System.out.println("----Creating 2 object of a computer type -----");	
		Computer com2=new Computer();
		com2.brand="Dell";
		com2.name="420";
		com2.memory=125;
		
		com2.playGames();
		com2.watchMovie();
		com2.javaCoding();
	
	}
	
	}
