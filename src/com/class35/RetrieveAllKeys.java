package com.class35;

import java.util.*;

public class RetrieveAllKeys{

	public static void main(String[] args) {
		// Creste a map of a person (name, lastname, address, city, state)
	
		Map<String, String> personMap=new LinkedHashMap<>();
		personMap.put("name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Adress", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		System.out.println(personMap);
	
		//how to retrieve a spesific value?
		String value=personMap.get("State");
		System.out.println(value);
		
		//how to retrieve all keys an all values?
		System.out.println("-------Printing all keys--------");
		Set<String> keys=personMap.keySet();
		
		for (String key : keys) {   //how can I retrieve and print values key:value
			System.out.println(key+":"+personMap.get(key));
		}
	
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		
		System.out.println("-------Printing all values--------");
		
		Collection<String> values=personMap.values();
		for (String val : values) {
			System.out.println(val);
		}
		
		Iterator<String> valuesIterator=values.iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}
		System.out.println("==============================================");
		//how can I retrieve and print values key:value
		
		Iterator<String> keysIterator1=keys.iterator();
		while(keysIterator1.hasNext()) {
//		System.out.println(keysIterator1.next()+":"+personMap.get(keysIterator1.next()));
		String mapkey=keysIterator1.next();
		String mapValue=personMap.get(mapkey);
		
		System.out.println(mapkey+":"+mapValue);
		}	
	}

}
