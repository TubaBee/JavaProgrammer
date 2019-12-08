package com.class24;

public class TaskHoca {
	
	public TaskHoca() {

		System.out.println("I am public constructor");

	}

	TaskHoca(String str) {

		System.out.println("I am default constructor");

	}

	protected TaskHoca(int num) {

		System.out.println("I am protected constructor");

	}

	private TaskHoca(int num, int num2) {

		System.out.println("I am private constructor");

	}

	

	public static void main(String[] args) {

		TaskHoca obj=new TaskHoca();

		TaskHoca obj1=new TaskHoca(4);

		TaskHoca obj2=new TaskHoca(4, 5);

		TaskHoca obj3=new TaskHoca("Some string");

	}
	
	
	
	
	
	
	
	
	

}
