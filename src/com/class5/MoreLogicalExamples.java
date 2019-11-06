package com.class5;

import java.util.Scanner;

//to import short cut CTRL+Shift+O 
public class MoreLogicalExamples {
	public static void main(String[] args) {
			
	/*ask user to entr daily sales
	 * based on the sales range we want to give commission to the person 
	 * is sales is <100 --> commission is %10
	 * if sales is between 100-200 --> comission of %20
	 * etc
	 * */

		Scanner scan;
		double salesAmount;
		double comission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		salesAmount=scan.nextDouble();
		
	
		if (salesAmount<100) {
			//lets give user %10 comission of sale
			comission=salesAmount*0.1;
			System.out.println("You comission is %10");
		}else if(salesAmount>=100 && salesAmount <200){
			//lets give user %20 comission of sale
			comission = salesAmount*0.2;
		}else if(salesAmount>=200 && salesAmount<500) {
			//lets give user %30 comission of sale
			comission =salesAmount*0.3;
		}else if (salesAmount>=500) {
			//lets give user %50 comission of sale
			comission=salesAmount*0.5;
		}else {
			comission =0;
			
		}
		
		System.out.println("BAsed on the sales your comission is "+comission);
	}	
}
