package TwoDArray;

import java.util.Scanner;

public class StateOfWakanda2 {
	
	
	private static void stateOfWakanda(int array[][]) {
		
		for(int gap=0;gap<array.length;gap++) {
			for(int i=0, j=gap ; j<array[0].length ; j++, i++) {
				System.out.println(array[i][j]);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[][] = new int[n][n];
		
		array = InputClass.getScanner(array, n, n, scn);
		stateOfWakanda(array);
	}

}
