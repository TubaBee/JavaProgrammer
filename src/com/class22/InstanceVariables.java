package com.class22;

public class InstanceVariables {
	
		String name="Samir"; //instance variable

		public static void main(String[] args) {
			
			String name="Burcu"; //local varable
			System.out.println(name);
			
			InstanceVariables obj=new InstanceVariables();
			System.out.println(obj.name);
			//changing value of the instance variable
			obj.name="John";
			System.out.println(obj.name);
			
			InstanceVariables obj1=new InstanceVariables();
			//value will be samir
			System.out.println(obj1.name);
		
		}
		
		
}
