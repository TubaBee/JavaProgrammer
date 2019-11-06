package com.class10;

public class AllValues {

	public static void main(String[] args) {
		
		String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
		
		int size=animals.length;
		
		for (int i =0;i<size; i++) {
			System.out.print(animals[i]+" ");
		}
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
		
		
		//Create an array to store 5 double values, print all in one line
			double[] d= {1.34,2.55,3.66,4.77,5.88};
		
		System.out.print(d[0]+" "+d[1]+" "+d[2]+" "+d[3]+" "+d[4]+" bittiii      ");
		System.out.println(".... second way......");
		for(int q=0; q<d.length; q++) {
			System.out.print(d[q]+" ");
		}
		
	}

}
