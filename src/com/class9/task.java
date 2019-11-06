package com.class9;

public class task {

	public static void main(String[] args) {
		/* 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 */
		
		for (int a=5; a>0; a--) {
			for (int b=1; b<=a; b++) {
				System.out.print(a);
			}System.out.println();
		}

		
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		
		for (int q=1; q<=5; q++) {
			for(int w=1; w<=q; w++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for (int q=5; q>=1; q--) {
			for(int w=1; w<q; w++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
	}

}
