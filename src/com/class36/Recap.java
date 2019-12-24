package com.class36;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Recap {

	public static void main(String[] args) {
		//Create a Map of grocaries that will store product and it is quantities and we want to maintain the insetion order for keys

	//	Map<K, V> variableName=new MapChildObject<>();

		Map<String, Integer> groceryMap=new HashMap<>();
		groceryMap.put("Milk", 2);
		groceryMap.put("Tea", 3);
		groceryMap.put("Onion", 5);
		groceryMap.put("Apple", 10);

		//retrieve single value
		groceryMap.get("Apple");

		//verify if specific key or value is in the map
		groceryMap.containsKey("Milk");
		groceryMap.containsValue(2);

		//how to retrieve all values?
		Collection<Integer> values=groceryMap.values();
		for(Integer val: values){
			System.out.println(val);
		}

		Iterator<Integer> valIt=values.iterator();

		while(valIt.hasNext()){
		System.out.println(valIt.next());
	}
		
		//get all keys map them to values (milk --> 2)
		
		//Set<String> keys=groceryMap.keySet();//eger bunu yapmazsak 
		for(String k:groceryMap.keySet()) {
			System.out.println(k.toUpperCase()+"-->"+groceryMap.get(k));
		}
		
		Iterator<String> kIt=groceryMap.keySet().iterator();
		while(kIt.hasNext()) {
			System.out.println(kIt.next().toLowerCase()+"-->"+groceryMap.get(kIt.next()));
		}
		
		//get all keys and map them to values (milk -->2)using entrySet
		Set<Entry<String, Integer>> entr=groceryMap.entrySet();
		for(Entry<String,Integer> e: entr) {
			System.out.println(e.getKey()+"==>"+ e.getValue());
		}
	}
}
