package com.class35;

import java.util.*;


public class Task1 {

	public static void main(String[] args) {
		Map<String, String> country=new HashMap<>();
		country.put("Turkey", "Ankara");
		country.put("USA", "Washington DC");
		country.put("Russia", "Moscow");
		
		Set<String> cMap=country.keySet();
		for (String key : cMap) {
			System.out.println(key+":"+country.get(key));
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
		Iterator<String> it =cMap.iterator();
		while(it.hasNext()) {
			String count=it.next();
			System.out.println(count+":"+country.get(count));
		}
		
		System.out.println("--------Collection---------");
		Collection<String> collect=country.values();
		for (String c : collect) {
			System.out.println(c);
		}
		
		System.out.println("^^^^^^^^^Iterator^^^^^^^^^^^");
		Iterator<String> itt=collect.iterator();
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
		
		
		

	}

}
