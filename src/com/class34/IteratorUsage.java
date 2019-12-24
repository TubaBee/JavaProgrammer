package com.class34;

import java.util.*;

public class IteratorUsage {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("John");
		stringList.add("Hel");
		stringList.add("Tuba");
		stringList.add("Al");
		stringList.add("Ak");

		// remove names are shorter that 4 character
		stringList.remove(2);
		System.out.println(stringList);
		// removing element using for loop
		
		
		for (int i = stringList.size()-1; i >=0; i--) {
			if(stringList.get(i).length()<4) {
				stringList.remove(i);
			}
		}
		
		
//		for (int i = 0; i < stringList.size(); i++) {
//			if (stringList.get(i).length() < 4) {
//				stringList.remove(i);
//			}
//		}
		System.out.println(stringList);

	}

}
