package com.vishnu.practice;

class Practicenov7 {
	int s = 0;

	void check() {
		if (s == 0)
			System.out.println("switch is working");
		else
			System.out.println("switch is not working");
	}

	public static void main(String args[]) {

		Practicenov7 checkstatus = new Practicenov7();
		checkstatus.check();
	}
}
