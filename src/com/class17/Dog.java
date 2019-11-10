package com.class17;

public class Dog {
	
	String name,size,tur,gender;
	
	void gender() {
		System.out.println("My dog "+name+" my dog gender is "+gender);
	}
	
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.name="Husky";
		d.size="small dog";
		d.tur="Tuylu";
		d.gender="Girl";
		d.gender();
		
		Dog d1=new Dog();
		d1.name="Bulldog";
		d1.size="middium dog";
		d1.tur="az tuzlu";
		d1.gender="Boy";
		d1.gender();
		
		Dog d2=new Dog();
		d2.name="Labrador";
		d2.size="Big dog";
		d2.tur="Tuysuz";
		d2.gender="Boy";
		d2.gender();
		
		System.out.println("My dog "+d.name+" "+d.size+" and "+d.tur);
		
		
		
	}
	
	
	

}
