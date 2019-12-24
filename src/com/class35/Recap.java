package com.class35;

import javax.print.DocFlavor.STRING;

import java.util.*;

public class Recap {

	public static void main(String[] args) {
		Set<Double> set=new LinkedHashSet<>();
		set.add(99.99);
		set.add(59.99);
		set.add(39.99);
		set.add(10.99);
		set.add(90.99);
		
		
		Iterator<Double> iteratorr=set.iterator();
		while(iteratorr.hasNext()){
			double d=iteratorr.next();
			if(d<50) {
				iteratorr.remove();
			System.out.println(d);
		}}	

		System.out.println("....for Loop.....");
		for(Double d1: set) {
			System.out.println(d1);
		}
		
		Collection<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("John");
		aList.add("John");
		aList.add("John");
		aList.add("John");
		aList.add("John");
		aList.add("John");
		
		Set<String> hSet=new HashSet<>();
		hSet.addAll(aList);
		System.out.println(hSet);
		
		aList.clear();
		System.out.println(aList);
		aList.addAll(hSet);
		System.out.println(aList);
	
		////////////////////////////////////////////////////////////////////////////////////////////////////
		//How can T access/update just 1 value from the Set collection
		
		Set<String> lSet=new LinkedHashSet<>(); //keep the order
		lSet.add("Morning");
		lSet.add("Noon");
		lSet.add("Evening");
		lSet.add("Night");
		
		//convert to the ArrayList
		List<String> myList=new ArrayList<>();
		myList.addAll(lSet);
		String element=myList.get(2);
		System.out.println(element);
		
		//another way to create an object of ArrayList by passing values to the cons
		List<String> myList1=new ArrayList<>();
		}

}
