package com.java.start;

public class SecondProblem {
	public String sayWelcome(String name){
		return "Hi "+name+", Welcome to JAVA.";
	}
	public static void main(String[] args) {
		System.out.println("Hi JAVA.................");
		System.out.println(new SecondProblem().sayWelcome("Gourav"));
	}
}
