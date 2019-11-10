package com.class17;

import java.util.Scanner;

public class ComputerCode {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Computer com=new Computer();
		
		com.brand="Lenova";
		com.name="IdeaPad Flex";
		com.keyboard=true;
		com.memory=250;
		com.screen=16;
		com.monitor="";
		com.mouse="";
		
		com.javaCoding();
		
		System.out.println("My Computer is "+com.brand+" "+com.name);
		System.out.println("My Computer screen is "+com.screen+" memory has "+com.memory+"GB");

	}

}
