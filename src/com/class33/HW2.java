package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW2 {

	public static void main(String[] args) {
		//Create arrayList of words.
		//remove every word that ends with "e". Use iterator

		List<String> list=new ArrayList<>();
		list.add("Cute");
		list.add("Love");
		list.add("Hello");
		list.add("Java");
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			if(it.next().endsWith("e")) {
				it.remove();
			//	break;  eger break koyarsak sadece ilk e ile baslayani siler digerlerini yazar bir daha bakmaz
			}
		}
		System.out.println(list);
	}

}
