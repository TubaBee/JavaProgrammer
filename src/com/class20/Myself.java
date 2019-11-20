package com.class20;

public class Myself {
	public static void main(String[] args) {
		MySonMath son1=new MySonMath();
		son1.name="Ensar";
	
		son1.add1();
		son1.add2(5,6);
	
		
	System.out.println(son1.add3());
	int result2=son1.add4(5, 7);
	System.out.println(result2);
	
	if(result2== 12) {
		System.out.println(result2+" Good job "+son1.name);
	}else {
		System.out.println(result2+" You are not good enough, but it is OK");
	}
	
	System.out.println(checkResult(12, result2));
	
	
//	son1.add5(); this is not visible 
	
	
//................................................
	}

	public static boolean checkResult(int myResult, int mySonResult) {
		boolean isOk=false;
		if(myResult == mySonResult) {
			isOk= true;
		}else {
			isOk=false;
		}
	return isOk;
	
	
	
	}

}
