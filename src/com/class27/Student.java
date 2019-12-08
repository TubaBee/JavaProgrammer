package com.class27;

/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism */

public class Student {
	public void study() {
		System.out.println("Student needs to study");
	}
	private void doHomework() {
		System.out.println("Student needs to do homework");
	}
	public void research() {
		System.out.println("Student needs to do research");
	}
	void attendClasses() {
		System.out.println("Student needs to do attend Classes");
	}
	
}

class SyntaxStudent extends Student {
	//@Override -- we are not overriding, 
	//child class having it is own method doHomework();
	public void doHomework() {
		System.out.println("Student needs to do homework");
	}

	public void study() {
		System.out.println("Syntax student need more coding");
	}
	protected void attendClasses() {
		System.out.println("Syntax student need more attend classes");
	}
}

class CollegeStudent extends Student {
	public void study() {
		System.out.println("College Student needs more study ");
	}
}

class SchoolStudent extends Student {
	public void study() {
		System.out.println("School Student need do more project");
	}
}	

	
