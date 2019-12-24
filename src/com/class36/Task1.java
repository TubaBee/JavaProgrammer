package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*Create a Map from array of cities that will sort keys in alphabetical order. 
 * As a key store the name of the city and as a value store the length of 
 * the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
If any city name is more than 7 characters remove that city ( use Iterator ). 
*/

public class Task1 {

	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<>();
		map.put("Paris",5);
		map.put("Moscow", 10);
		map.put("Pakistan",6);
		map.put("Turkey", 7);
		map.put("dsfj",8);
		map.put("ewri", 9);
		map.put("mxncmxnmxnc",4);
		map.put("laslsla", 3);
		
		System.out.println(map);
		
		
		Iterator<Entry<String, Integer>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> all=it.next();
			if(all.getKey().length()<7) {
			System.out.println(all.getKey()+":::"+all.getValue());
			}
			
	}

}}
