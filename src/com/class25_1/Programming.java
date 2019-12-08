package com.class25_1;

public class Programming {
	/*Create a class named 'Programming'. While creating object of the class, if nothing is passed to it,
	 * then the message "I love programming language" should printed.
	 * if some String is passed to it then in place of "Programming language" the value variable should be printed.
	 * Example , if we pass"Java" , then "I love Java" should be printed.
	 * Create1 class with a static method that has 3 overload forms. Then call each overload methodwith specific arguments and observe result.
	 *Create1 class with a private method that has 3 overload forms. Then call each overload methodwith specific arguments and observe result.
	 */
	
	public void Prog(){
		System.out.println("I love programming language");
	}
	
	public void Prog(String str){
		System.out.println("I love "+str);
	}
	
	public static void main(String[] args) {
		Programming obj=new Programming();
		obj.Prog();
		obj.Prog("Java");
		
		
	}

}
