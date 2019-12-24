package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		//Lets create an ArrayList to store number 
		
		ArrayList<Integer> numbers= new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		
		int size=numbers.size();
		System.out.println(size); //4
		
		//add more
		numbers.add(10000);
		//remove
		numbers.remove(2);
		numbers.remove(size-1); //3
		
		System.out.println(numbers);
		
		//retrive value from an arrayList
		int element=numbers.get(0);
		System.out.println(element);//1
		
		//1. for loop
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		//2. advanced loop
		for (int num : numbers) {
			System.out.println(num);
		}
		
		System.out.println("-------------------------------");
		//I want to get values backward
		for (int i =numbers.size()-1; i>=0; i--) {
			System.out.println(numbers.get(i));
		}
		
		//3 using Iterator
		Iterator<Integer>iterator=numbers.iterator();
		
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
		
		int number=iterator.next();
		if(number%2 ==0) {
			System.out.println(number);
		}
		
		}
		
	}

}
