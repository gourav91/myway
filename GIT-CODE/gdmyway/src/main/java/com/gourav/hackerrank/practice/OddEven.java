package com.gourav.hackerrank.practice;

import java.util.Scanner;
/*Given an integer $N$ as input, check the following:

If $N$ is odd, print "Weird".
If $N$ is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
If $N$ is even and, in between the range of 6 and 20(inclusive), print "Weird".
If $N$ is even and $N> 20$, print "Not Weird".
We given you partially completed code in the editor, complete it to solve the problem.

Input Format

There is a single line of input: integer $N$.

Constraints 
$ 1 \le N \le 100$

Output Format

Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not print the quotation marks.*/

public class OddEven {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		}else if(n % 2 == 0 && n>=2 && n<=5){
			ans = "Not Weird";
		}else if(n % 2 == 0 && n>=6 && n<=5){
			ans = "Weird";
		}else if(n % 2 == 0 && n>20){
			ans = "Not Weird";
		}
		System.out.println(ans);

	}
}
