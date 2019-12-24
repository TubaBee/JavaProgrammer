package com.class38;

public class SpecificToGeneral {

	public static void main(String[] args) {
		int num1=10, num2=0;
		int result;
		try {
			result=num1/num2;  //new ArithmeticException();
			System.out.println(result);
			Thread.sleep(2000);  //new InterruptedException
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(InterruptedException e) {
			System.out.println("e");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of my method");

	}

}
