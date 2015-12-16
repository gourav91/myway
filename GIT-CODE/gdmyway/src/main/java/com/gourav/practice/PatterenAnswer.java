package com.gourav.practice;

/*
 * 
 * 
 * Draw Following Patteren on custom input
 Author - Gourav Dhiman
 Date - 17-12-2015
    *
   **
  ***
 ****

 */

public class PatterenAnswer {
	public static void main(String[] args) {
		int n =5; //vishnu change it into custom input and commit
	// outer loop take care for the count	
       for(int i = 1; i<n;i++){
    	   // loop take care spaces
    	   for(int j=1; j<n-i; j++){
    		   System.out.print(" ");
    	   }
    	   //loop take care stars
    	   for(int k=0; k<i; k++){
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
	}
}
