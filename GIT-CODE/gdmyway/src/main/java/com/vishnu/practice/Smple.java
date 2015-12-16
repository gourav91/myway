package com.vishnu.practice;

import java.util.Scanner;

public class Smple {
	int age = 12;
	String name = "Gourav";

	void display() {
		System.out.println("Hi my name is " + name + " and my age is " + age);
	}

	public static void main(String[] args) {
		Smple smple = new Smple();
		smple.display();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Where do you live");
		String adress= scanner.nextLine();
		System.out.println("wht is ur contact nu");
		int number = scanner.nextInt();
		System.out.println("----------------------------");
		System.out.println("My Number is :     "+number);
		System.out.println("My Address is :     "+adress);
	}
}
