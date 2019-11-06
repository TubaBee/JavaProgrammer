package com.class12;

public class TwoDArrayRecapDemo {

	public static void main(String[] args) {
		
		int [][] array=new int[2][3];
		
		array[0][0] =9;
		array[0][1] =10;
		array[0][2] =11;
		
		array[1][0] =19;
		array[1][1] =20;
		array[1][2] =21;
		
		for(int i[]:array) {
			
			for(int j:i) {
			System.out.println(j);
			}
		}
		
		System.out.println("...............");
		
		int [][] array2= {
				{44,55,67},{11,22,33}
		};
		
		for (int[] is : array2) {
			for (int is2 : is) {
				System.out.println(is2);
			}
			
		}
		
		
		

	}

}
