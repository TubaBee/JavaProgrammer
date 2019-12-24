package com.class34;

import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		//create a collection that will store Sweets type of object and 
		//I do not care about the order as long as I do not have duplicate objects
		
		Set<Sweets> sweetSet=new HashSet<>();
		
		Sweets sweet =new Sweets("Cake");
		sweetSet.add(sweet);
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(new Sweets("Ice Cream"));
		sweetSet.add(new Sweets("Baklava"));
		sweetSet.add(new Sweets("Macaroons"));
		sweetSet.add(new Sweets("Chocolate"));
		sweetSet.add(sweet);
		
		System.out.println(sweetSet.size()); //6
		//hoe do we print name of each sweet?
		System.out.println("------------1 way---------------");
		for(Sweets element : sweetSet) {
			System.out.println(element.name);
		}

		System.out.println("------------2 way---------------");
		Iterator<Sweets> it= sweetSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}
		
		
	}

}
