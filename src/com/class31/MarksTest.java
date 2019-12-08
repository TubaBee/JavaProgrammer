package com.class31;
/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
 * by student A and in four subjects (each out of 100) by student B. Create class ‘Marks’ 
 * with an abstract method ‘getPercentage’. It is inherited by classes ‘A’ and ‘B’ each having a method 
 * with the same name which returns the percentage of the students. The constructor of student A takes 
 * the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
 *  Test your code  */


abstract class Marks {
	
	public abstract void getPercentage();

}

class A extends Marks {

	int not1, not2, not3;

	A(int not1, int not2, int not3) {
		this.not1 = not1;
		this.not2 = not2;
		this.not3 = not3;
	}

	@Override
	public void getPercentage() {
		int result = (not1 + not2 + not3) / 3;
		System.out.println("Not ortalaman " + result);
	}

}

class B extends Marks{

	int not1,not2,not3,not4;

	B(int not1, int not2, int not3, int not4){
		this.not1=not1;
		this.not2=not2;
		this.not3=not3;
		this.not4=not4;
	}
	@Override
	public void getPercentage() {
		int result=(this.not1+this.not2+this.not3+this.not4)/4;
		System.out.println("Not ortalaman "+result);
	}
	
}

public class MarksTest {
	public static void main(String[] args) {
		A sA=new A(87, 90, 55);
		sA.getPercentage();
		B sB=new B(88, 33, 90, 89);
		sB.getPercentage();
		
	}

}
