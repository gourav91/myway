package com.vishnu.practice;
import java.util.Scanner;



public class Student {
	int a;
	int b;
	int c;
	
	void check()
	{
		Scanner use = new Scanner(System.in);
		System.out.println("Enter first number");
		a= use.nextInt();
		System.out.println("Enter second number");
		b = use.nextInt();
		System.out.println("Enter third number");
		c = use.nextInt();
		if (a>b && a>c)
			System.out.println("The Greatest number is "+a);
		else if (b>a && b>c)
			System.out.println("The Greatest number is "+b);
		else if (a==b && a==c )
			System.out.println("All numbers are Same");
		else
			System.out.println("The Greatest number is "+c);
		
		
	}
	
	    public static void main(String[] args) {
			Student chck= new Student();
			chck.check();
	    	
		}
	
	
	
}
