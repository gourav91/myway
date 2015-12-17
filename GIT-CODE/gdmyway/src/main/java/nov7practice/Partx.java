package nov7practice;
import java.util.Scanner;

public class Partx {
	int i;

	void check() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		

		for (i = 0; i < x; i++) {
			

			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		                        }

	             }

	public static void main(String[] args) {
		Partx test = new Partx();
		test.check();

	}
}
