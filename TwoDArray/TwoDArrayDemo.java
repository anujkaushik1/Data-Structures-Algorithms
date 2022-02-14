package TwoDArray;

import java.util.Scanner;

public class TwoDArrayDemo {
	
	private static void display(int array[][]) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int array[][] = null;
		
		array = InputClass.getScanner(array, n, m, scn);
		display(array);
	}

}
