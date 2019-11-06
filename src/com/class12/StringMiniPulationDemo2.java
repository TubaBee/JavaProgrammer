package com.class12;

public class StringMiniPulationDemo2{

	public static void main(String[] args) {
		
		  /*
         * .contains();
         * This method  searches the sequence of characters in the string.
         * If the sequences of characters are found,
         * then it returns true otherwise returns false.
         */
        String sentence="It was raining";
        String sen="raining";
        System.err.println(sen.contains(sentence));
        
        System.out.println(sentence.contains("was"));
     System.out.println("''''''''''''''''''''''''''''''");   
        // Create two Strings and initaialize them with some value.
        //implement the following methods on those strings.
        
        /*
         * sen.length();
         * sen.equals();
         * sen.contains(s);
         * sen.toUpperCase();
         * sen.toLowerCase();
         * sen.equalsIgnoreCase(anotherString);
         */
 
        String b="Esra Rabia";
        String b1="esra rabia";
        System.out.println(b.length());
        System.out.println(b.equals("Esra Rabia"));
        System.out.println(b.contains("Esra"));
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(b.equalsIgnoreCase(b1));
 
        /*
         * This method test if a string starts with the
         * specified prefix beginning
         */
        System.out.println("............Startwith .......");
        String str2="It is very hot in the class";
        System.out.println("Is this string starts with ="+str2.startsWith("It"));
        System.out.println("Is this string starts with ="+str2.startsWith("is",3));
        
        
        /*
         * This method tests if this string ends with
         * the specified suffix
         */
        
        System.out.println("Is this string ends with =" +str2.endsWith("class"));
        
        
        
        
        
	}

}
