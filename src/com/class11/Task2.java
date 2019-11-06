package com.class11;

public class Task2 {

	public static void main(String[] args) {	
/*Create a 2D array of integer type with 3 rows and 4 columns 
 * and print all values of the whole array.
 */
	int [][] array= {
			{1,2,3,4},
			{5,6,7,8},
			{9,0,10,11}
	};
	
	for(int a=0; a<array.length; a++) {
		for(int b=0; b<array[a].length; b++) {
			System.out.print(array[a][b]+" ");
		}System.out.println();
	}
	System.out.println("......................");
	/*	Create a 2D array or integer type where you will store
	 *  odd and even numbers in 3 rows and 4 columns. 
	 *  Develop a program which will identify/print 
	 *  the even numbers only.
	 */
	System.out.print("Even number inside arrays: ");
	for(int a=0; a<array.length; a++) {
		for(int b=0; b<array[a].length; b++) {
			if (array[a][b]%2==0) {
				System.out.print(array[a][b]+" ");
			}
			
		}
	}

	System.out.println();
System.out.println("~~~~~~~~~~~~~~~");

		
	/*	Create a 2D array or integer type and store numbers 
	 * in 3 rows and 3 columns. Print the sum of all numbers.
	 */
	
	int[][] store= { {11,22,33},
			{44,55,66},
			{77,88,99},
	};
	
	int sum=0;
	for(int x=0; x<store.length; x++) {
		for (int y=0; y<store[x].length; y++) {
		sum=sum+store[x][y];	
			
		}
	}System.out.println("The sum of all elements in the array is = "+sum);
	
	// 2nd way result
	int sum1=0;
	for (int nums[] : store) {
		for(int getNum : nums) {
			sum1=sum1+getNum;
		}
	}
	System.out.println("The sum of all elements in the array is = "+sum1);
	
	}
	

}
