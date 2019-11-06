package com.class9;

import java.util.*;
public class JavaExercises
{
public static void main(String[] args)
{
  caculateValues();
}

static void caculateValues(){

  float a;
  float b;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a:");
  a=sc.nextFloat();
  System.out.println("The value of a before adding:"+a); 
  System.out.print("Enter b:");
  b=sc.nextFloat();
  a+=b;
  System.out.println("The value of adding:"+a);
  
  System.out.println(".................................");
  
  float amount_dep, rate, tax, interest_earned, tax_amount; 
  Scanner sc1=new Scanner(System.in);
  System.out.print("Enter the amount of deposit:");
  amount_dep=sc1.nextFloat();
  System.out.print("Enter yearly interest rate:");
  rate=sc1.nextFloat();
  interest_earned=amount_dep*(rate/100); //amount of interest before tax calculation 
  System.out.print("Enter income tax rate:");
  tax=sc1.nextFloat();
  tax_amount=interest_earned*(tax/100);
  interest_earned-=tax; //the final interest earned
  System.out.println("The interest earned in the year:"+interest_earned);
  
  


}
}