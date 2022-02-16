package One_D_Array;
import java.util.Scanner;
public class InputClass {
	
	protected static void displayNextLine(int array[]) {
		
		for(int val : array) {
			System.out.println(val);
		}
	}
	
	protected static int[] getScanner(int array[], int n, Scanner scn) {
		
		array = new int[n];
		
		for(int i=0;i<array.length;i++) {
			array[i] = scn.nextInt();
		}
		
		return array;
	}

}
