package com.vishnu.practice;

import java.util.Scanner;

public class Calculator {
	
	int a;
	int b;

	void prfrm(){
	
	
	    Scanner hg= new Scanner(System.in);
	    System.out.println("Kindly choose the operation which you want perform:\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication");
	
	int c= hg.nextInt();
	System.out.println("Enter two numbers");
    a= hg.nextInt();
    b= hg.nextInt();
		if (c==1)

        System.out.println("Addition of two number is: " +(a+b));
        else if(c==2)
	    System.out.println("Subtraction of two numbers is: "+(a-b));
        else if (c==3)
        	System.out.println("Division of two numers is: "+(a/b));
        else if (c==4)
        	System.out.println("Multiplication of two numbers is: "+(a*b));
        else 
        	System.out.println("Incorrect Selection");
	
	}

	public static void main(String[] args) {
		Calculator chck = new Calculator();
		chck.prfrm();
	}
}
