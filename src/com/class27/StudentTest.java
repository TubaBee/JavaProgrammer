package com.class27;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new CollegeStudent();
		Student s2=new SchoolStudent();
				
		SyntaxStudent ss=new SyntaxStudent();
		ss.study();
		ss.doHomework(); // if method is private : c: not visible since method inside child is private
		ss.attendClasses();
		ss.research();
		
		Student s=new SyntaxStudent();
		s.research();
		s.study();
		s.attendClasses();
	//	s.doHomework();	compiler error: not visiable since method inside parent is private 
	}

}
