package com.class19;

public class Task {
	/*
	 * 1-Create a method createEmail(). Based on provided users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * johnsnow@gmail.com or johnsnow@yahoo.com* 2-Write a method to return whether
	 * given number is prime or not? 3-Create class Student that will have a method
	 * getGrade. Your method should accept the score of a student and return a
	 * grade: score > 90 - A score >80 - B score >70 - C score > 50 - D anything
	 * else - F
	 */

	String createEmail(String username, String lastname, String email) {
		String compEmail = username + lastname + "@" + email + ".com";
		return compEmail;
	}

	boolean prime(int num) {
		boolean prime=true ;
	for (int i = 2; i <num; i++) {
		if(num%i==0 || num<=1) {
		prime=false;
		}
	}System.out.print(num+" ");
		return prime;
	}

	

	char score(int num) {
		char score;
		if (num >= 90 && num <= 100) {
			score = 'A';
		} else if (num >= 80 && num < 90) {
			score = 'B';
		} else if (num >= 70 && num < 80) {
			score = 'C';
		} else if (num >= 50 && num < 70) {
			score = 'D';
		} else if (num < 50) {
			score = 'F';
		} else {
			score = '-';
		}
		System.out.print(num+" ");
		return score;
		
	}

	public static void main(String[] args) {
		Task obj = new Task();
		String e = obj.createEmail("tuba", "onsal", "gmail");
		System.out.println(e);

		boolean p = obj.prime(113);
		System.out.println(p);
		
	
		char s = obj.score(55);
		System.out.println(s);

	}

}
