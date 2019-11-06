package com.class11;

public class Task4 {

	private static int b;

	public static void main(String[] args) {
		
	/*	Create an array of cars : american, german, korean, italian. 
	 * Then retrieve all values from that array
	 */
	String [][] car= {{"Ford"," GeneralMotors", "Chrysler"," Cadillac"," Chevrolet"," Buick"," Dodge", "Jeep"," RAM"," Tesla"},
			{"Porsche"," Mercedes-Benz"," BMW"," Audi"," Volkswagen"," Opel"," Maybach"," Smart", "Borgward"},
			{"Hyundai"," Kia Motors"," Daewoo"," REnault"},
			{"Ferrari", "Lamborghini", "Maserati", "Fiat", "Alfa Romeo", "Lancia", "Iveco", "Abarth", "Pagani", "Pininfarina"}};
	String[] cc= {"American Car","German Car","Korean Car","Italia Car"};
		
	for(int x=0; x<car.length; x++) {
		System.out.println(cc[x]);
		for(int y=0; y<car[x].length; y++) {
			System.out.print(car[x][y]+" - ");
		}System.out.println();
		
	}
		
//............................................................................................	
		
	/*	Create an array of countries: north america countries, 
	 * south america countries, europe countries, asian countries, 
	 * african countries. Then print all values from that array.
	 */
System.out.println("..............................");	
	String[][] con= {{"Bahamas","Barbados","Belize","Canada","Costa Rica","Cuba","Dominica"},		 //NAC 
					{"Colombia","Venezuela","Belize","Ecuador","Peru","Brazil","Argentina"},		//SAC 
					{"Belgium","the Netherlands","Luxembourg","Ecuador","Monaco"},	//europe
					{"Bangladesh","China","India","Indonesia","Iraq","Mongolia","Philippines","Vietnam"}, //Asian
					{"African","Nigeria","Ethiopia","Egypt","Congo","Tanzania"}// african
	
	
	};  
	String [] cn= {"North American Contiries name:","South American Contiries name: ",
			"Europen Contiries name: ",
			"Asian Contiries name: ","African Contiries name: "};

	
	for(int a=0;a<con.length; a++) {
		System.out.println();
		System.out.println(cn[a]);
		for(int b=0; b<con[a].length; b++){
		
		if (a==0 ){
			System.out.println(con[a][b]+" ");
		}else if (a==1) {
			
			System.out.println(con[a][b]+" ");
		}else if(a==2) {
			
			System.out.println(con[a][b]+" ");
		}else if(a==3) {
			
			System.out.println(con[a][b]+" ");
		}else if(a==4) {
			
			System.out.println(con[a][b]+" ");
		}
		
	  }
	}
	
	
	}

}
