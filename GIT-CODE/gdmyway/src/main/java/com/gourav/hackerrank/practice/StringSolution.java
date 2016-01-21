package com.gourav.hackerrank.practice;

import java.util.Scanner;

/*
 Two strings, the first being A and the second being B. They are comprised of lowercase English letters (no symbols or spaces) and may not be on the same line.

 Output Format

 There are three lines of output: 
 For the first line, sum the lengths of A and B. 
 For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
 For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.*/
public class StringSolution {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String firstString = sc.next();
		String secondString = sc.next();
		System.out.println(firstString.length() +secondString.length());
		if (firstString.compareTo(secondString) > 0) {
			System.out.println("Yes");
		} else
			System.out.println("No");
		System.out.println(firstString.substring(0, 1).toUpperCase() + firstString.substring(1)
				+ " " + secondString.substring(0, 1).toUpperCase() +secondString.substring(1));
	}
}
