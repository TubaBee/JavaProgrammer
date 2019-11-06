package com.class13;

public class AllstringgMethods {

	public static void main(String[] args) {
		/*str.isEmpty();-->str nin ici bosmu degil mi true or false
		 * str.length();-->str nin icindeki harf sayisini yazar
		 * str.toUpperCase();-->yazilan kelimeleri buyuk harflerle yazar
		 * str.toLowerCase();-->yazilan kelimeleri kucuk harflerle yazar
		 * str.equals(str1)-->yazilan kelimelerin esit olup olmadiklarn bakar buyuk kucuk harfi onemser
		 * str.equalsIgnoreCase(str1);-->yazilan kelimelerin esit olup olmadiklarn bakar buyuk kucuk harfi onemsemez
		 * str.concat();-->
		 * str.contains("ll");--> str de icinde "ll" harfleri varmi diye bakar true or false cevap verir
		 * str9.startsWith("Today");-->str nin icindeki cumlenin hangi kelime ile basladigini sorarsin true or false olarask cevap verir
	 	 * str9.endsWith("day");-->
	 	 * str.concat("ekleme kelimeler");-->Daha onceden str nin icindeki cumleye ekleme yaptirir
	 	 *str.trim();--> yazilan cumlenin etrafinda bosluklar varsa onlari yazdirmaz sadece cumleyi yazdirir
	 	 * str.charAt();-->
	 	 * str.indexOf('e');-->cumlenin icindeki e harfinin hangi sirada oldugunu soyler sayi olarak
	 	 * str.charAt(12);--> cumle icindeki yazilan saydaki harfi pastirir
	 	 * 
		 */

		String str="Hello LaLALALALA";
		
		
		String str3="hi";
		String str2="World";
		//String str2=str.concat("World");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		String str1=new String("Hello");
		System.out.println(str3.replaceAll(str3, str));
		
		int[] a= {12,32,55,77};
		System.out.println(a.length);
		String str4= "FairFox";
		System.out.println(str4.toUpperCase());
		
		String str5="Hello";
		String str6="Hello";
		String str7=new String("Bye");
		String str8=new String("Bye");
		
		System.out.println(str5.equals(str6));
		System.out.println(str5==str6);
		System.out.println(str7==str8);//nesneleri karsilastiriyor ayni bile olsa yerleri farkli yerlerde ise == false degeri verebilir
		/*    .equals : compares the values (are both of them have the same sequence of char? )
         *    ==   : compares the objects   (are these same objects? )
         *
         */
		System.out.println("====== startsWth and endsWith ======");
		String str9="Today is Saturday";
		System.out.println(str9.startsWith("Today"));
		System.out.println(str9.endsWith("day"));

		System.out.println("==== concat ============");
		System.out.println(str9.concat(" and we have java class"));
	
		System.out.println("====== trim =======");
		String str10 ="      it is sunny day      ";
		System.out.println(str10.trim());
	
		System.out.println("======= Indexof charAt ======");
		String str11="Tomorrow we will be done with String Manipulation";
		System.out.println(str11.indexOf('e'));
		System.out.println(str11.indexOf('e', 11));
		System.out.println(str11.indexOf("we"));
		
		System.out.println(str11.charAt(10));
		
	}

}
