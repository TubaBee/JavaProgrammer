package com.class34;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		//lets create a collection of vegies where I do not want to have duplicate
		//hset order of the elements is not preserved
		HashSet<String> hset=new HashSet<>();
		//stroing values into hashset
		hset.add("cucember");
		hset.add("onion");
		hset.add("peper");
		hset.add("zuccini");
		hset.add("carot");
		hset.add("zuccini");
		hset.add("onion");
		
		System.out.println(hset.size());
		System.out.println(hset);
		
		//tehey do not have any methods to retrieve elemnets from the collection
		//.get();  .set();  
		
		//how can we retrieve all elements?
		
		Iterator<String> it=hset.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		}
		
		System.out.println("-----------------");
		//enhanced for loop
		
		for (String el : hset) {
			System.out.println(el);
		}
		
		
	}

}
