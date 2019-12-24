package com.class36;

import java.util.Collection;
import java.util.LinkedList;

/*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.

Create a collection of integers in which you can keep duplicates. 
Write a logic to find sum of all integers */

public class Task2 {
static String val;
	public static void main(String[] args) {
		Collection<String> d=new LinkedList<>();
		d.add("Benzersiz");
		d.add("Degismez");
		d.add("Tek");
		d.add("Bir tane");
		
		System.out.println(d);
		
		Collection<Integer> i=new LinkedList<>();
		i.add(11);
		i.add(22);
		i.add(33);
		i.add(44);
		i.add(55);
		i.add(66);
	
		
		for (int j = 0; j < i.size(); j++) {
			int sum;
		}
	}

}
