package com.class36;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		Map<Integer , String> hashMap=new HashMap<>();
		hashMap.put(1, "Monday");
		hashMap.put(2, "Tuesday");
		hashMap.put(3, "Wednesday");
		hashMap.put(null, "Thursday");
		hashMap.put(5, "Frıday");
		hashMap.put(6, "Saturday");
		hashMap.put(null, "Sunday");
		hashMap.put(null, "Saturday");
		hashMap.put(8, null); 			//	one null key istedigin kadar null value olabilir
		
		System.out.println(hashMap);
		
		Map<Integer , String> linkedHashMap=new LinkedHashMap<>();
		linkedHashMap.put(1, "Monday");
		linkedHashMap.put(2, "Tuesday");
		linkedHashMap.put(3, "Wednesday");
		linkedHashMap.put(4, "Thursday");
		linkedHashMap.put(5, "Frıday");
		linkedHashMap.put(6, "Saturday");
		linkedHashMap.put(null, "Sunday");
		linkedHashMap.put(null, "Saturday");		//one null key istedigin kadar null value olabilir
		linkedHashMap.put(8, null); 			
		
		System.out.println(linkedHashMap);
		
		
		Map<Integer , String> treeMap=new TreeMap<>();
		treeMap.put(1, "Monday");
		treeMap.put(2, "Tuesday");
		treeMap.put(3, "Wednesday");
		treeMap.put(4, "Thursday");
		treeMap.put(5, "Frıday");
		treeMap.put(6, "Saturday");
		treeMap.put(7, "Sunday");
		//treeMap.put(null, "Saturday"); //istedigin kadar value null olabilir ama key olmaz
		treeMap.put(8, null); 			
		
		System.out.println(treeMap);
		
		Map<Integer , String> hashTable=new Hashtable<>();
		hashTable.put(1, "Monday");
		hashTable.put(2, "Tuesday");
		hashTable.put(3, "Wednesday");
		hashTable.put(4, "Thursday");
		hashTable.put(5, "Frıday");
		hashTable.put(6, "Saturday");
		hashTable.put(7, "Sunday");
	//	hashTable.put(null, "Saturday");  //null value yada key e izin verilmiyor
	//	hashTable.put(8, null); 	
		
		System.out.println(hashTable);
	
	}

}
