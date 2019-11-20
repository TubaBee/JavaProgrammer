package com.class20_other;

//import com.class20.MySonMath;
//import com.class20.USA;
import com.class20.*;// butun com.class package icin yazilir

public class Mexico {

	public static void main(String[] args) {
	//When public
	USA us2=new USA();
	System.out.println("Access from Mexico class");
	System.out.println(us2.mainState);
//	System.out.println(us2.school);	
//	System.out.println(us2.capitalCity);		
	
	//When USA is default
	//I cannot access USA class because they are in differnt package
	USA us3=new USA();
	MySonMath son =new MySonMath();
	son.add1();
	
	}
	
	
}
