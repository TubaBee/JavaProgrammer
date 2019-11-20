package com.class21;

import com.class20.Myself;

public class School {
	public static void main(String[] args) {
	Student.school="Morning School";
		
		Student student0=new Student();		
		student0.displayInfo();
		
		
		Student student1=new Student();
		//assigning instance varialbes
		student1.studentName="Eric";
		student1.GPA=3.95;
		student1.school="Syntax";
		
		student1.displayInfo();
				
		Student student2=new Student();
		student2.studentName="Jaime";
		student2.GPA=3.90;
		student2.school="Syntax Tecnoloji";
	
		student2.displayInfo();
		
		int hours =3;
		student1.study(hours);
		
		System.out.println("Student 1 again");
		student1.displayInfo();
		
		
		
		
}
}
