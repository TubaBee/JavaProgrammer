package com.class9;

public class Pyramid {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
		}System.out.println();
	}
		
		System.out.println("^^^^^^^^^^^^^6");
		
		//1
		//12
		//123
		//1234
		//12345

		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
		}System.out.println();
	}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~`");
		/* 1
		 * 22
		 * 333
		 * 444
		 * 5555
		 * 66666
		 * 777777
		 * 8888888
		 * 99999999
		 */
		
		for (int a=1; a<=9; a++) {
			for (int j=1; j<=a; j++) {
				System.out.print(a);
		}System.out.println();
	}
		//tersi 9 dan 1 e inicek
		
		for (int a=9; a>0; a--) {
			for (int j=1; j<=a; j++) {
				System.out.print(a);
		}System.out.println();
	}
}
}