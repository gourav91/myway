package com.vishnu.practice;

import java.util.Scanner;

public class Temprature {
	
	void convert(double degree) {

	//	Scanner scanner = new Scanner(System.in);
		//int number = scanner.nextInt();
		degree = (degree - 32) * 5 / 9;

		System.out.println("The value in Degree Centigrade is " + degree);

	}

	public static void main(String[] args) {

		Temprature check = new Temprature();
		System.out.println("Enter value in Fahrenheit");

		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();
		check.convert(number);

	}

}