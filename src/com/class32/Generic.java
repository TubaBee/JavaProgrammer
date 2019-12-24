package com.class32;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("Aysenur");
		arrList.add("Serife");
		arrList.add("Esma");
		arrList.add("Veysel");
		arrList.add("Hatice");
		
		if(!arrList.isEmpty()) {
			int mySize= arrList.size();
			for (int i = 0; i < mySize; i++) {
				System.out.println(arrList.get(i));
				System.out.println("********************");
			}
		}
		
		System.out.println("........Benim yaptigim...............");
		System.out.println("ArrayList is empty : "+arrList.isEmpty());
		System.out.println("Array contains is Esma : "+arrList.contains("Esma"));
		System.out.println("ArrayList size : "+arrList.size());
		System.out.println("ArrayList inside : "+arrList);
		
//...........in ArrayListType.java.................................		
		
		//ArrayList can Generic and non-Generic 
		//Non Generic
		
		
		ArrayList alist=new ArrayList();
		alist.add("Hello");
		alist.add(100);
		alist.add(10.10);
		alist.add(true);
		alist.add('c');
		int y=(int) alist.get(1);
		System.out.println("...."+y+".....");
		
		System.out.println(alist);
		ArrayList<Double> list=new ArrayList<Double>();
		list.add(100.10);
		
	}

}
