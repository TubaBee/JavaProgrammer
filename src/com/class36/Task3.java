package com.class36;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/*Create a Map that will store Employee name and salary. 
Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000  */

public class Task3 {

	public static void main(String[] args) {
		Map<String, Integer> em=new LinkedHashMap<>();
		em.put("John", 20000);
		em.put("Jack", 55000);
		em.put("Jassy", 25000);
		em.put("Jully", 35000);
		em.put("Hans", 40000);
		em.put("Jennifer", 45000);
		int mS=0;
		Collection<Integer> c=em.values();
		for (Integer i : c) {
			if(i>mS) {
				mS=i;
			}
		}System.out.println(mS);
	}

}
