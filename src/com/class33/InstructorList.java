package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InstructorList {

	public static void main(String[] args) {
		//create a lost that will hold 5 instractor 
		
		List<Instructor> iList =new ArrayList<>();
		
		iList.add(new Instructor("Asel","Umurzakova"));
		iList.add(new Instructor("Diego","Juarez"));
		iList.add(new Instructor("Mohammed","Shokriyan"));
		iList.add(new Instructor("Weqas","Haq"));
		
		for (Instructor i : iList) {
			System.out.print(i.name+"\t");
			System.out.println(i.lastName);
			i.display();
		}
		

	}

}
