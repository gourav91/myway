package com.gourav.basicprogramming.practice;

public class FirstProblem {
	public String sayWelcome(String name){
		return "Hi "+name+", Welcome to JAVA.";
	}
	public static void main(String[] args) {
		System.out.println(new FirstProblem().sayWelcome("Gourav"));
	}
}
