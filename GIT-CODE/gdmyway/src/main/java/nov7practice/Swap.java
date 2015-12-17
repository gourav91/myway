package nov7practice;

import java.util.Scanner;

public class Swap {
	int a;
	int b;

	void swp() {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter first number");
		a = k.nextInt();
		System.out.println("Second number");
		b = k.nextInt();
		System.out.println("Numbers before swapping are " + a + "  " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Numbers after swapping are " + a + "  " + b);

	}

	public static void main(String[] args) {

		Swap chck = new Swap();
		chck.swp();

	}

}
