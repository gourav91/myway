package com.vishnu.practice;

import java.util.Scanner;

public class Factorial {
	int i;
	int fact = 1;

	void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of number is " +fact);

	}

	public static void main(String[] args) {
		Factorial display = new Factorial();
		display.check();
	}
}
