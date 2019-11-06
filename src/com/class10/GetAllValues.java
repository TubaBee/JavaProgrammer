package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		//I want to print all values form an array
		//when value is Dog --> I love dogs
		
		String[] animals= {"Cat","Cow","Snake","Dog","Elephant"};
		
		for (int i=0; i<animals.length; i++) {
		//	System.out.println(animals[i]);
			
			if (animals[i].equals("Dog")) {
				System.out.println("I love Dogs");
			}else {
				System.out.println(animals[i]);
			}
		}

	}

}
