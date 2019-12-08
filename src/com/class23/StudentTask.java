package com.class23;

public class StudentTask {

	/*
	 * 2-Write a java program of Class Students that takes students name and 3
	 * subject grades. Inside your class also have a method to Calculate Average
	 * Grade. Test Student class for 5 different students with different marks. Your
	 * program should print an average mark of each students name. NOTE: please use
	 * different names for instance and local variables.
	 */

	String Sname;
	int ave;
	int g1;
	int g2;
	int g3;

	StudentTask(String name, int gr1, int gr2, int gr3) {
		Sname = name;
		g1 = gr1;
		g2 = gr2;
		g3 = gr3;
	}

	void average() {
		ave = (g1 + g2 + g3) / 3;
		System.out.println("Student name is " + Sname + " average grade is " + ave);
	}

	public static void main(String[] args) {

		StudentTask a = new StudentTask("Tuba", 85, 90, 100);
		a.average();
		StudentTask b = new StudentTask("Ayse", 82, 55, 99);
		b.average();
		StudentTask c = new StudentTask("Fatma", 80, 90, 87);
		c.average();
		StudentTask d = new StudentTask("Ali", 81, 92, 45);
		d.average();
		StudentTask e = new StudentTask("Arif", 87, 0, 99);
		e.average();
		e.hello();
	}
	
	public void hello() {
		System.out.println(Sname);
	}

}
