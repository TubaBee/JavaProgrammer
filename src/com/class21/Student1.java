package com.class21;

public class Student1 {

	
	public String studentName;
	public int studentId;
	public static int numberOfStudent;

	public static void main(String[] args) {
		
		/*2. Create a Class called Students
		*Create three variables studentName , studentID and numberOfStudents
		* Create three objects of the Students Class
		* Set the value for studentName , studentID and increment the numberOfStudents for each object
		* Print out total number of students
		 */

		Student1 s1 = new Student1();
		s1.studentName = "Tuba";
		s1.studentId = 111;
		Student1.numberOfStudent++;

		Student1 s3 = new Student1();
		s3.studentName = "Seval";
		s3.studentId = 123;
		Student1.numberOfStudent++;

		Student1 s5 = new Student1();
		s5.studentName = "Sumail";
		s5.studentId = 145;
		Student1.numberOfStudent++;

		System.out.println("The total number of student is: " + Student1.numberOfStudent);
		System.out.println("The total number of student is: " + s3.numberOfStudent);
		System.out.println("The total number of student is: " + s5.numberOfStudent);

	}

}
