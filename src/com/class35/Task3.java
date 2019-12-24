package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Task3 {

	public static void main(String[] args) {
		/*Create a map of Best Buy store. Place
		item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )

		Retrieve all keys and values from a Best Buy map using EntrySet.*/
		
		Map<Integer, String> BestBuy=new HashMap<>();
		
		BestBuy.put(88881, "Laptop");
		BestBuy.put(88882, "Projector");
		BestBuy.put(88883, "Mouse");
		BestBuy.put(88884, "Keyword");
		BestBuy.put(88885, "Monitor");
		BestBuy.put(88886, "PC");
		
		System.out.println(BestBuy);
		
		Set<Entry<Integer, String>> kE=BestBuy.entrySet();
		System.out.println("..........for loop..........");
		for (Entry<Integer, String> ent : kE) {
			System.out.println(ent.getKey()+" : "+ent.getValue());
		}
		
		System.out.println(".........Iterator..........");
		Iterator<Entry<Integer, String>> itE=kE.iterator();
		while(itE.hasNext()) {
			Entry<Integer, String> e=itE.next();
			System.out.println(e.getKey()+" ---> "+e.getValue());
		}
		
		
//		while(itE.hasNext()) {
//			System.out.println(itE.next());
//		}
//		
		
	}

}
