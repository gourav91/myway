package nov7practice;

public class Fab {

void disp(){

int array[] = new int[20];

array[0] = 0;

array[1] = 1;

for (int i = 2; i < array.length; i++) {

array[i]=array[i-1] + array[i-2];

System.out.print(array[i-2]+" ");


}

}
public static void main(String[] args) {
	Fab show = new Fab();
	show.disp();
}

}
