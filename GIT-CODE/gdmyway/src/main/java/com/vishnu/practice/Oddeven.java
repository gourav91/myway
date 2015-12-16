package com.vishnu.practice;

import java.util.Scanner;

public class Oddeven {
	
	double number;
	

	
	void display()
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Number ");

		
		 number = scanner.nextDouble();
		 if (number%2==0)
			System.out.println("Number is even");
		 else
			 System.out.println("Number is Odd");	
	}
	
	public static void main(String[] args) {
		
		Oddeven check= new Oddeven();
		check.display();
	}

}
