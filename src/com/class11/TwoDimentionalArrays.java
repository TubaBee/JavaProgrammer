package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		
		//Declare 2D Array
		
		int [] [] array=new int[3][4];
		
		// 1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		//2nd row
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		//3rd row
		array[2][0]=1;
		array[2][1]=2;
		array[2][2]=3;
		array[2][3]=4;
		System.out.println(array[1][3]);

		// Task create 2D array of String with 2 and 3 columns.
		// and print value in second row and 3rd column
		
		String [][] arr=new String[2][3];
		arr[0][0]="Apple";
		arr[0][1]="Banana";
		arr[0][2]="Plum";
		
		arr[1][0]="Kivi";
		arr[1][1]="Orange";
		arr[1][2]="Peach";
		System.out.println(arr[1][2]);
		System.out.println("........");
		
		for(int a=0; a<2; a++) {
			for(int b=0; b<3; b++) {
		System.out.println(arr[a][b]);
		}}
//.............................................................................			
			
			
			int [][] numbers= {
					{8,7,55,3,8},
					{10,12,33,4,9,7},
					{3,6,8,0,7}
			};
			
			System.out.println("The value in index 1 and 4 is: "+numbers[1][4]);
			
			// to identify the numbers of rows
			System.out.println("The numbers of rows are : "+numbers.length);
			// to identify the numbers of columns
			System.out.println("The numbers of rows are : "+numbers[1].length);
			
			for (int i=0; i<numbers.length; i++) {
				for(int j=0; j<numbers[i].length; j++) {
					System.out.print(numbers[i][j]+" ");
				}System.out.println();
			}
			
			
			
			
		
		}
}