package com.class5;

public class logicalOr {
	public static void main(String[] args) {
		//7 days a week
		//if day is 2 or 4 --> SDLC class
		//if day is 6 or 7 -->Java class
		//if day 1 or 5 -- >No class
		//if day=3 --> review class
		int day =6;
		//false OR false --> false
		if(day==2 || day==4) {
			System.out.println("SDLC class");
			//true Or false--> true
		}else if(day==6 || day==7) {
			System.out.println("JAVA class");
			//false OR false--> false
		}else if(day==1 || day==5) {
			System.out.println("NO class");
		}else if(day==3) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
		}
		
		
		//7 days a week
				//if day is Tuesday or Thursday --> SDLC class
				//if day is Saturday or Sunday -->Java class
				//if day Monday or Friday -- >No class
				//if day=Wednesday --> review class
		
		
		String weekDay="Sunday";
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC class");
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java class");
		}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("NO class");
		}else if(weekDay.equals("Wednesday")) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
		}
		
		
		
		
		
		
	}

}
