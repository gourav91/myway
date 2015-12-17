package nov7practice;

public class Partc {
	int i;
	void test(){
		for(i=1;i<=5;i++) {
			
			int j;
			for (j=0;j<i;j++){
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
	}
	public static void main(String[] args) {
		
		Partc display = new Partc();
		display.test();
	}
	
	
	
	
	
	

}
