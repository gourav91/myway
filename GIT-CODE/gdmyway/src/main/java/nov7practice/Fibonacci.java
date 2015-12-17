package nov7practice;
import java.util.Scanner;

public class Fibonacci {
	
	void input(){
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int x = scan.nextInt();
		int f0=0, f1=1;
		System.out.print("The Fibonacci Series for entered number is: "+ f0+" "+f1);

		int fn=0;
		for(int i=2;i<x;i++){
			fn = f0+f1;
			System.out.print(" "+fn);
			f0 = f1;
			f1 = fn;			
		}
				 }
public static void main(String[] args) {
	Fibonacci check= new Fibonacci();
	check.input();
}
}
