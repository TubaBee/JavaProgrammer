package com.class17;

public class Phone {
	
	String name,model,size,color,brand;
	int memory;
	boolean sor=true;
	
	void faceTime() {
		if (sor==true) {
		System.out.println("My phone "+brand+" has FaceTime" );
		}else {
			System.out.println("My phone "+brand+" has NOT FaceTime");
		}	
	}
void call() {
		System.out.println("I can call with my "+brand);
	}
	
	
	public static void main(String[] args) {
		System.out.println("..........Android..........");
		Phone an=new Phone();
		an.brand="Android";
		an.model="Samsung";
		an.size="Large";
		an.memory=16;
		an.color="Black";
		an.sor=false;
		an.faceTime();
		an.call();
	
		System.out.println("...........Nokia..........");
		Phone no=new Phone();
		no.brand="Nokia";
		no.model="3210";
		no.size="small";
		no.memory=8;
		no.color="Gray";
		no.sor=false;
		no.faceTime();
		no.call();
	
		System.out.println("..........iPhone.........");
		
		Phone ip=new Phone();
		ip.brand="IPhone";
		ip.model="8 Plus";
		ip.size="Large";
		ip.memory=32;
		ip.color="White";
		ip.sor=true;
		ip.faceTime();
		ip.call();
	}
	
	
	
	
	
	

}
