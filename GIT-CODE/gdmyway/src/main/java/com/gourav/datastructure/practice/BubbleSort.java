package com.gourav.datastructure.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the Number of elements in Array");
		/*BufferedReader consoleInput = new BufferedReader(new InputStreamReader(
				System.in));*/
		Scanner consoleInput = new Scanner(System.in);
		int number = consoleInput.nextInt();
		int inputArray[] = new int[number];
		for (int i = 0; i < number; i++) {
			inputArray[i] = consoleInput.nextInt();
		}
		for (int j = 0; j < inputArray.length-1; j++) {
			for (int k = 0; k < inputArray.length-j-1; k++) {
				if (inputArray[k] > inputArray[k + 1]) {
					int temp = inputArray[k];
					inputArray[k] = inputArray[k+1];
					inputArray[k+1] = temp;
				}
			}

		}
		
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(" "+inputArray[i]);
		}

	}
}
