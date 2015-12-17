package com.vishnu.practice;
import java.util.Scanner;
public class Pattern {
	int i, j, k;

	void test(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value");

		int x= scan.nextInt();
		for(i=1;i<=x;i++){
		
			
			
			for(j=1;j<=x-i;j++){
				System.out.print(" ");
			}
			
			for(k=1;k<=i;k++){
				System.out.print("*");				
			}
			System.out.println();
		
		}
	}
	public static void main(String[] args) {
		Pattern check = new Pattern();
		check.test();
	}
}