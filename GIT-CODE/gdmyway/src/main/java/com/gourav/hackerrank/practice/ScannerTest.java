package com.gourav.hackerrank.practice;

import java.util.Scanner;

/*Input Format

 There are three lines of input. 
 Line one contains an integer. 
 Line two contains a double. 
 Line three contains a String.

 Output Format

 On the first line, print String: followed by the unaltered input String. 
 On the second line, print Double: followed by the unaltered input double. 
 On the third line, print Int: followed by the unaltered input integer.*/
public class ScannerTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("String: " + s);
		System.out.println("Double: " + y);
		System.out.println("Int: " + x);
	}
}
