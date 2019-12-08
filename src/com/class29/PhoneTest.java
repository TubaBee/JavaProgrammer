package com.class29;

public class PhoneTest {
	public static void main(String[] args) {
		//you cannot directly create an object of an abstract class
		//Phone obj=new Phone(); CE: cannot instanciate
		
		//we can create it indirectly
		
		Phone obj=new iPhone();
		obj.makeCall();
		obj.sentText();
		obj.takePictures();
		obj.playGames();
	}

}
