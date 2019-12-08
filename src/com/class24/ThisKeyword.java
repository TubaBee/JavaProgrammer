package com.class24;

public class ThisKeyword {
	
	int a,b;
	
	public ThisKeyword() {
		System.out.println("I am non argument constructor");
	}
	
	public ThisKeyword(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void sum(int a,int b) {
		System.out.println("The sum of local parameters is "+(a+b));
		System.out.println("The sum of instance variable is "+(this.a+this.b));
	}
	
	public void sayA() {
		System.out.println(a);
	}
	public void sayB() {
		System.out.println(b);
	}
	
	public void sayAsayB() {
		this.sayA();
		sayB(); //compiler add this automatically-->this.sayB();
	}
	
	
	public static void main(String[] args) {
		ThisKeyword t=new ThisKeyword(5, 10);
		t.sum(10,20);
		t.sayAsayB();
		t.sayA();
		t.sayB();
		ThisKeyword t1=new ThisKeyword(20, 20);
		t1.sum(100,200);
	}

}
