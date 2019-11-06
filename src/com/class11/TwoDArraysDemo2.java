package com.class11;

public class TwoDArraysDemo2 {

	public static void main(String[] args) {
	
		String [][] names= {
				{"Khan","Yousuf","Alex","Zynab"},
				{"Muhammad","Ann","Naslyhan","Weqas"},
				{"Diago","Asif","Zubair","Shogofa"},
				
		};
		
		int lengthOfRows=names.length;
		System.out.println(lengthOfRows);
		
		int lengthOfCols=names[0].length;
		System.out.println(lengthOfCols);
		
		for(String getArrays[]: names) {
			for (String getName: getArrays ) {
				System.out.print(getName+" ");
				
			}System.out.println();
		}

	}

}
