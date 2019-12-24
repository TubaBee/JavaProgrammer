package com.class36;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Create a Person class with following private fields: name, lastName, age, salary. 
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. 
In that map store personId and a Person Object. Print each object details. */

class Person{
	private String name , lastName;
	private int age;
	
	Person(String name, String lastName, int age){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
	}
	
	public void display() {
		System.out.println(name+" "+lastName+" "+age);
	}
	
}


public class Task {

	public static void main(String[] args) {
		Map<Integer, Person> mapPerson=new HashMap<>();
		
		mapPerson.put(1, new Person("Tuba", "Onsal",35));
		mapPerson.put(2, new Person("Bayram", "Yildirim",59));
		mapPerson.put(3, new Person("Behiye", "Yildirim",58));
		mapPerson.put(4, new Person("Esma", "Ayaydin",30));
		mapPerson.put(5, new Person("Aysenur", "yildirim",19));
		
	Set<Integer> sP=mapPerson.keySet();
		for (Integer i : sP) {
			System.out.print(i+" ");
			mapPerson.get(i).display();
		}
		
	}

}
