//write a program to print week days between 1-7.

 package com.test;

 import java.util.Scanner;
 public class Weekdays
 {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	          System.out.println("enter weekdays number:");
			  int weekdays = sc.nextInt();
			  
			  if (weekdays==1)
			  {
				  System.out.println("Monday");
			  }else if (weekdays==2)
			  {
				  System.out.println("Tuesday");		
              }else if (weekdays==3)
			  {
				  System.out.println("Wednesday");
			  }else if (weekdays==4)
			  {
				  System.out.println("Thrusday");
			  }else if (weekdays==5)
			  {
				  System.out.println("Friday");
			  }else if (weekdays==6)
			  {
				  System.out.println("Saturday");
			  }else if (weekdays==7)
			  {
				  System.out.println("Sunday");
			  }else
			  {
				  System.out.println("Please enter the correct weekdays number");
			  }
   }
 }