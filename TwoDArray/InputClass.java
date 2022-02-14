package TwoDArray;
import java.util.Scanner;
public class InputClass {
	
	
	protected static void display(int array[][]) {
		
		for(int val[] : array) {
			for(int ans : val) {
				System.out.print(ans+" ");
			}
			System.out.println();
		}
	}
	
	protected static void displayNextLine(int array[][]) {
		
		for(int[] val : array) {
			for(int ans : val) {
				System.out.println(ans);
			}
		}
	}
	
	protected static int[][] getScanner(int array[][], int n, int m, Scanner scn) {
		
		array = new int[n][m];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				array[i][j] = scn.nextInt();
			}
		}
		
		return array;
	}

}
