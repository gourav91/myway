package nov7practice;

import java.util.Scanner;

public class Person {
	void per() {
		System.out.println("Enter Person details");
         Scanner scanner = new Scanner(System.in);


		System.out.print("Person name: ");
 		String name = scanner.nextLine();
 		
 		System.out.print("Person E-mail ID: ");
		String email = scanner.nextLine();


		System.out.print("Person age: ");
		int age = scanner.nextInt();
		System.out.print("Person Contact number: ");

		int phone = scanner.nextInt();
		
		System.out.println("Person name is "+name);
		
		System.out.println("Person email address is "+email);
		System.out.println("Person age is "+age);
		System.out.println("Person contct number is "+phone);
}
	
	

}
