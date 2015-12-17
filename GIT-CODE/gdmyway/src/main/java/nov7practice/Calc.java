package nov7practice;

public class Calc {

	void sum(int... x) {
		int add = 0;
		for (int value : x) {
			add = value + add;

		}
		System.out.println("Addition is " + add);

	}
void subtract(int ... y){
	int sub=0;

	for (int value : y) {

		sub = value-sub;
		System.out.println(sub);
	}
	System.out.print("Subtraction is "+sub);
}
	public static void main(String[] args) {
		Calc addition = new Calc();
		addition.sum(2,2,2,2,2,2,2,2,2,2);
		addition.subtract(100,110,120,130,140,150,160,170);

	}

}
