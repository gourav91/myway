package nov7practice;

import java.util.Iterator;

public class Varargs {
	void vishy(String...values){
		for (String var : values) {
			System.out.print(var+" ");
		}
	}
	
	void sum(int ...datas){
		int addition=0;
		for(int var:datas){
			addition = var +addition;
		}
		System.out.println("Addition is "+addition);

	}
	
	public static void main(String[] args) {
		Varargs display = new Varargs();

		display.vishy("My","name","is","vishnu","sharma");
		display.sum(2,4,5,5,6,6,7);
	}

}
