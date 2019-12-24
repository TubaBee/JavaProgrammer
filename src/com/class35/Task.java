package com.class35;

import java.util.*;

public class Task {

	public static void main(String[] args) {
		
		HashMap<Integer, String> floor=new HashMap<>();
		
		floor.put(1, "Google");
		floor.put(2, "Syntax");
		floor.put(3, "FairFox");
		floor.put(4, "Chrome");
		floor.put(5, "Gmail");
		floor.put(6, "Hotmail");
		floor.put(7, "Live");
		System.out.println(floor);
		
		int a=floor.size();
		System.out.println(a);
		
		floor.replace(4, "Outputs");
		System.out.println(floor);
		
		floor.remove(7);
		System.out.println(floor);
		
		
		
		
		
	}

}
