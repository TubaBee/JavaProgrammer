package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		String[] actualNames= {"Jhon","Smith","Alex","Tanaz"};
		Arrays.sort(actualNames);
		String[] expectedNames= {"Smith","Jhon","Tanaz","Alex",};
		
		// To sort the elements of an Array
		Arrays.sort(expectedNames);
		
		System.out.println(Arrays.deepToString(actualNames));
		
		String actual=Arrays.deepToString(actualNames);
		String expected=Arrays.deepToString(expectedNames);
		
		System.out.println(actual.equals(expected));
		
		
		int [] num = {92, 43, 45, 64, 1};
		
		
        Arrays.sort(num);
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i]+" ");
        }
		System.out.println("//////////");
		
		int[] numbers = {12,44,33,11,77,55};
		
		
		
		
		for (int d:numbers) {
			System.out.print(d+" ");
		}
		
		System.out.println("**********");
		System.out.println();
			
		Arrays.sort(numbers); // verilen degerlerini sirssi ile yamaya yarar
		for (int z:numbers) {
			System.out.print(z+" ");
		}
		
		}
		
	}
	
