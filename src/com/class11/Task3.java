package com.class11;

public class Task3 {

	

	public static void main(String[] args) {
	/*	Create a 2D array where you will store the following values:
	 *  Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
	 *  After storing values print the following:
	 *  Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.*/
		
		String [][] name= { {"Mr","Mrs","Ms","Miss"},
				{"Obama","Smith","Jackson","Jordan"}
				
		};
		
		for(int a=0; a<name.length-1; a++) {
			System.out.println();
			for (int b=0; b<name[a].length; b++) {
				
				System.out.print(name[a][b]+" "+name[a+1][b]+"\n");
				
			}System.out.println();
		}
		
		
				
	 
	System.out.println("........................................");
	
	
	/*	Create a 2D array that first row will contain 4 names 
	 * and second row will contain grades.
	 *  Then you program should print name of the students 
	 *  that has as an A and B grade
	 */
		String [][] og= {{"Ayse","Busra","Esra","Ekrem"},
				{"A","B","C","D","E","F"}};
		
		for(int a=0; a<og.length-1;a++) {
			for(int b=0;b<og[a].length; b++) {
		//		if (og.equals("Ayse")) {
			//		System.out.println("Ayse's grade "+og[1][1]);
		//		}
			System.out.println(og[a][b]+" "+og[a+1][b]);
			
		}
		
		}
	}

}
