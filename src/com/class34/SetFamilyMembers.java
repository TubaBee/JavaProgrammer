package com.class34;

import java.util.*;

public class SetFamilyMembers {
	public static void main(String[] args) {
		// create a collection that won't allow duplicates and preserve the insertion
		// order
		Set<String> fruitSet = new LinkedHashSet<>();
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Grape");
		fruitSet.add("Pineapple");
		fruitSet.add("Banana");

		System.out.println(fruitSet.size());
		System.out.println(fruitSet);

		// create a collection that won't allow duplicates and sorts objects in
		// accesding order (0-9, A-Z)
		Set<Integer> tset = new TreeSet<>();
		tset.add(200);
		tset.add(2000);
		tset.add(20);
		tset.add(999);
		tset.add(0);
		tset.add(999);
		tset.add(0);

		System.out.println(tset.size());
		System.out.println(tset);

		// Adding collection into a Collection

		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("SElenium");
		list.add("TEstNG");

		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.addAll(fruitSet);
		linkedSet.add("Kestane");
		linkedSet.addAll(list);
		
		System.out.println("-------Objects from both collections");
		System.out.println(linkedSet);

	}

}
