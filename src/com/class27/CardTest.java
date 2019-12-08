package com.class27;

public class CardTest {
	public static void main(String[] args) {
		// primitive
		int i = 10;
		// non primitive
		String str = "Hello";
		MC mc;
		// take an Object of the child class and give reference to the parent
		// type reference variable= object is created
		Card card = new AX();
		card.chargeInterest();
		card.creditLimit();

		Card card1 = new MC();
		card1.creditLimit();

		Card card2 = new Visa();
		card2.creditLimit();

		// type [] arrayName={};
		// type [] arrayName=new type[];
		int[] numArray = { 10, 12, 13 };
		String[] strinfArray = { "aa", "bb", "cc" };
		//1 we created and object assigned to the variables and then
		//stored those variables inside the array
		Card[] cardArray = { card, card1, card2 };
		
		//creating an object and storing it directly into an Array of Cards
		Card[] cardArray1 = { new MC(), new AX(), new Visa(), new Discovery() };
System.out.println("......................");
		// cardArray[0]-->MC
		// cardArray[3]-->Discovery
		
		for(Card myCard: cardArray1) {
			myCard.chargeInterest();
			myCard.creditLimit();
		}
				
System.out.println(".....Creating object of each class.....");
		Card c1=new Card();
		c1.chargeInterest();
		c1.creditLimit();
		
		AX ax1=new AX();
		ax1.chargeInterest();
		ax1.creditLimit();
		
		MC mc1=new MC();
		mc1.cashBack();
		mc1.chargeInterest();
		mc1.creditLimit();
		
		MC mc2=new MC();
		MC mc3=new MC();
		
		Card cc=new MC();
		cc.chargeInterest();
		cc.creditLimit();
		System.out.println("Creating an array that will hold only");
		MC[] masterCard={mc1,mc2,mc3};	
		
		for(int y=0; y<cardArray.length; y++) {
			cardArray[y].creditLimit();
		}
		
		for (MC mcard : masterCard) {
			mcard.cashBack();
			mcard.chargeInterest();
			mcard.creditLimit();
		}
		
	}
}
