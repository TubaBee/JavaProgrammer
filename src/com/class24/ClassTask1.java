package com.class24;

import com.class23.MyPak24Class;

public class ClassTask1 {
	String Myname, LastName, MyLive;

	ClassTask1() {

	}

	ClassTask1(String name, String lastName, String live) {
		Myname = name;
		LastName = lastName;
		MyLive = live;

	}

	public void displayMy() {
		System.out.println("My name is " + Myname + " " + LastName + " I live in " + MyLive);
	}

	public static void main(String[] args) {
		ClassTask1 class1 = new ClassTask1("Tuba", "Onsal", "Orlando");
		ClassTask1 class2 = new ClassTask1("Erdem", "Onsal", "Orlando");
		ClassTask1 class3 = new ClassTask1("Emine", "Yavuz", "Atlanta");
		ClassTask1 class4 = new ClassTask1("Ayse", "Polat", "GreenVile");
		MyPak24Class class5 = new MyPak24Class("Behiye", "Yildirim", "Istanbul");
		class1.displayMy();
		class2.displayMy();
		class3.displayMy();
		class4.displayMy();

	}

}
