package com.vishnu.practice;
import java.util.Scanner;

public class Moverload {
		void sum(int a, int b){
			
			
			System.out.println("Sum of two numbers is "+(a+b));
			
		}
		void sum (int a, int b, int c){
			
			
			System.out.println("Sum of three numbers is "+(a+b+c));
		}
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter numbers ");
			int a= scanner.nextInt();
			int b= scanner.nextInt();
			int c= scanner.nextInt();
			
	
			Moverload chck= new Moverload();
			chck.sum(a,b);
			
			
		}
		
		}

