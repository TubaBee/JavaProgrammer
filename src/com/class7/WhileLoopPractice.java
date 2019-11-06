package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		//how to print numbers from 1 to 20

		int i=1;
		
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		
		//I want to print numbers from 10 to 30
		
		int y=10;
		while(y<=30) {
			System.out.print(y+" ");
			y++;
		}
		
		// how to print values 10 to 1;
		int a=10;
		while(a>=1) {
			System.out.println(a);
			a--;
		}
		
		int b=50;
		while(b>=20) {
			System.out.println(b);
			b--;
		}
		System.out.println(".......................");
		//I want to print all even number from 1 to 20 inclusive
		//1 way - increment value by 2
		int z=2;
		while(z<=20) {
			System.out.println(z);
			z+=2;
		}
		
		System.out.println("-----------------");
		//2 way using modules
		int q=1;
		while(q<=20) {
			System.out.println(".");
				if (q%2==0) {
			System.out.println(q);
		
		}
				q++;		
	}
		System.out.println("*******************");

		//print only odd number from 50 to 100
		
		int c=50;
		while(c<=100) {
			if (c%2==1) {
			System.out.println(c);
		
		}
				c++;		
	}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		//print only even number from 100 to 1
		
		int d=1;
		while(d<=100) {
			if (d%2==0) {
			System.out.println(d);
		
		}
				d++;		
	}
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		
}
}
