package com.class31;

public class AccountTest {

	public static void main(String[] args) {

		Account acc = new Account();
//		acc.accountNumber=8669699;
//		acc.balance=-87453421;

		acc.setAccountNumber(123456755); //deger 9 rakamli degilse sonuc gorunmez 0 cikar
		long accNum = acc.getAccountNumber();

		System.out.println(accNum);
		
		acc.setBalance(200); //deger sifir alti olursa sonuc 0.0 olur
		//double myBlance=acc.getBalance(); yada boyle yazilabilir
		//System.out.println(myBlance);
		System.out.println(acc.getBalance());
		
		int num=123;
		//"123"
		String .valueOf(num); // converts given value of string
		
	}

}
