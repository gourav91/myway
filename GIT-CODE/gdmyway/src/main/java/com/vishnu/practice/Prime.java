package com.vishnu.practice;
import java.util.Scanner;


public class Prime {
	
	int a;
	void check()
	   {	
		Scanner chck = new Scanner(System.in);
		System.out.println("Enter Number");
		a = chck.nextInt();
		if (a%2==1)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is Not Prime");
		}
	public static void main(String[] args) {
		
		Prime chck = new Prime();
        chck.check();
	
		
	}
         
}
