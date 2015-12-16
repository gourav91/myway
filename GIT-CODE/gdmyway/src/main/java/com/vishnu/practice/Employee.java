package com.vishnu.practice;

import java.util.Scanner;

public class Employee {

	void emp() {
		System.out.println("Enter Employee details:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Employee name");
		String name = scanner.nextLine();
		System.out.println("Employee E-mail ID");
		String email = scanner.nextLine();
		System.out.println("Employee age");
		int age = scanner.nextInt();
		System.out.println("Employee Contact number");
		int phone = scanner.nextInt();
		
		System.out.println("Employee name is "+name);
		System.out.println("Employee email address is "+email);
		System.out.println("Employee age is "+age);
		System.out.println("Employee contact number is "+phone);
		
		
	}

}
