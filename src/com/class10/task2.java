package com.class10;

public class task2 {
	public static void main(String[] args) {
	/*
	 * Create an array of countries. While retrieving all values from an array print
	 * capital for each country.
	 */

	String[] con= {"Turkey", "German", "USA", "France"};

	for(
	int a = 0;a<con.length;a++)
	{
		if (con[a].equals("Turkey")) {
			System.out.println("Istanbul");
		} else if (con[a].equals("German")) {
			System.out.println("Almanya");
		} else if (con[a].equals("USA")) {
			System.out.println("Washington DC");
		} else if (con[a].equals("France")) {
			System.out.println("Fransa");
		}

	}
}}
