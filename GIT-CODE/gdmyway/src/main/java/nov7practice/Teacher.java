package nov7practice;

import java.util.Scanner;

public class Teacher {
	
	void tech() {
		
		Person show= new Person();
		show.per();
		Employee displayemployee= new Employee();
		displayemployee.emp();
		System.out.println("Enter Teacher details:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teacher name");
		String name = scanner.nextLine();
		System.out.println("Teacher age");
		int age = scanner.nextInt();
		System.out.println("Teacher Contact number");
		int phone = scanner.nextInt();
		System.out.println("Teacher E-mail ID");
		String email = scanner.nextLine();
	}

}
