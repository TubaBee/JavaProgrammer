package com.class24;

public class Country {

	public String capital, name;
	public int population;
	
	public Country() {
		System.out.println("I am non argument constructor");
	}
	
	Country(String name, String capital, int population){
		this.name=name;
		this.capital=capital;
		this.population=population;
	}
	
	public void displayInfo() {
		System.out.println(name+"\t "+capital+"\t"+population);
	}

	public static void main(String[] args) {
//		Country country1=new Country();
//		country1.name="USA";
//		country1.capital="Wasington DC";
//		
//		Country country2=new Country();
//		country2.name="Kazakhstan";
//		country2.capital="Astana";
		
		Country country1=new Country("USA","Wastington DC", 350);
		Country country3=new Country();
		Country country2=new Country("Turkey","Ankara",18);
		
		country1.displayInfo();
		country2.displayInfo();
		country3.displayInfo();
//		System.out.println(country1.name);
//		System.out.println(country1.capital);
		
		
		
	}
	
	
	
	
}
