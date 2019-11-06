package com.class12;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
	// INTERVIEW SORUSU
		/* verilen array degerleri arasinda aynisi olan
		 * varsa onlari bulmak icin
		 */
		
		int [] array = {2,5,8,3,2,6,5,6};
		
		for (int i = 0; i < array.length; i++) {
		for (int j=i+1; j<array.length; j++) {
			if (array[i]==array[j]) {
				System.out.println(array[j]);
		}
		}
			
			
	//		System.out.println(array[i]);
	
		
		
		
		
		}
		
		
		
		
		

	}

}
