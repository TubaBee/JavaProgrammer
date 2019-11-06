package com.class10;

public class TaskAnotherWay {

	public static void main(String[] args) {
		
		String[] con= {"Afghanistan", "Colombia", "USA","Turkey", "Russia"};
		String capital=null;		
		
		for(int i=0; i< con.length; i++) {
			
			switch(con[i]) { 
			case "Afghanistan":
				capital="Kabul";
				break;
			case "Colombia":
				capital="Bogota";
				break;
			case "USA":
				capital="Washington DC";
				break;
			case "Turkey":
				capital="Ankara";
				break;
			case "Russia":
				capital="Moscow";
				break;
			
			}
			System.out.println(capital);
			
		}
		
		
	}

}
