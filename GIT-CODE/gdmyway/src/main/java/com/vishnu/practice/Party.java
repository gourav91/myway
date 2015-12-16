package com.vishnu.practice;

import java.util.Scanner;

public class Party {
	int i;

	void check() 
	{
		for (i = 5; i >= 1; i--) {
			
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			    System.out.println();
		    }
       }
	public static void main(String[] args) {
		Party test = new Party();
		test.check();
	}
	}