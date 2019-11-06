package com.class10;

public class task {

	public static void main(String[] args) {
		/*Create an array of chars and store grades into it:
		 * A,B,C,D,E,F. Then print a gradeB
		 * (use 2 different ways of creatin an array) 
		 */
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		
		char[] grade1={'A','B','C','D','E','F'};
		int a=2;
		System.out.println(grade1[1]); //B
		System.out.println(grade1[a]); //C
		a+=2; //2+2
		System.out.println(grade1[a]);//E
		a--; //4-1
		System.out.println(grade1[a]); //D
		
		for(int i=1; i<grade1.length; i++) {
			System.out.println(grade1[i]);
		}
		
		///..............question 2............
		
		// Create an array of names and store all names of your group.
		//Then print ypur name from that array.
		//(use 2 different ways of creatin an array) 
		
		String[] name= {"Tuba","Erdem","Ekrem","Busra","Esra"};
		System.out.println(name[0]);
		
		String[] name1=new String[5];
		
		name1[0]="Tuba";
		name1[1]="Erdem";
		name1[2]="Ekrem";
		name1[3]="Busra";
		name1[4]="Esra";
		System.out.println(name1[0]);
		
		
		///..............question 3............
		/*Create an array of words: Java, Saturday, day, coding,is.
		 * Print the following sentence using element of array:
		 * "Saturday is Java coding Day.
		 */
		
		String[] a1={"Java","Saturday","Day","coding","is"};
		System.out.println(a1[1]+" "+a1[4]+" "+a1[0]+" "+a1[3]+" "+a1[2]);
		
		String[] b=new String[5];
		b[0]="Java";
		b[1]="Saturday";
		b[2]="Day";
		b[3]="coding";
		b[4]="is";
		
		System.out.println(b[1]+" "+b[4]+" "+b[0]+" "+b[3]+" "+b[2]);
	
		
		
	}

}
