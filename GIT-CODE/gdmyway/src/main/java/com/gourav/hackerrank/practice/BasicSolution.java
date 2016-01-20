package com.gourav.hackerrank.practice;

import java.util.Scanner;

/*One way to take input from stdin is to use the Scanner class and read in from System.in.

You can write your output to stdout by simply using the System.out.println(String) function.

In this problem, you need to read 3 integers from stdin and print them in stdout.

Sample input:

42
100
125
Sample output:

42
100
125*/
public class BasicSolution {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    int inputArray[] = new int[3];
	    for(int i=0;i<3; i++){
		 inputArray[i] = sc.nextInt();
	    }
	    for(int i=0;i<3; i++){
	    	System.out.println(inputArray[i]);
		    }

	}
}
